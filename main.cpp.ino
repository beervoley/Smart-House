
double temp = 0; // temp var
bool ifRoom1 = false, ifRoom2 = false, ifRoom3 = false; // three vars to check if there is light in room1,room2,room3
char val = '0'; // var to keep messages from the phone app
int room1 = 6; // indexex for rooms' lights
int room2 = 5;
int room3 = 3;
int light1, light2, light3; // vars to keep power for leds
int a, b, c; // some vars to keep power for leds before mapping
int heater = 7; // port for heater
int keys = 10; // port for keys for lights
int ifCurrent = 0; // var to check if there is current in the key circuit
int switchState = 0; // collect switchstate
int previousSwitchState = 0; // collect previous switchstate
int lightBulb = 2; // port for lightbulb
int alarmPin = 12; // port for alarm
int room3IfOn = 8; // room3 keys
int ifDoorOpen = 9; // port for alarm detection
int motionSensor = 4; // port for motion senser



void setup()
{
  Serial.begin(9600);
  pinMode(lightBulb,OUTPUT);
  pinMode(motionSensor,OUTPUT);
  pinMode(ifDoorOpen,INPUT);
  pinMode(alarmPin,OUTPUT);
  pinMode(lightBulb,OUTPUT); 
  pinMode(room1, OUTPUT);
  pinMode(room2, OUTPUT);
  pinMode(room3, OUTPUT);
  pinMode(heater, OUTPUT);
  pinMode(keys,INPUT);
  pinMode(room3IfOn,INPUT);
  digitalWrite(alarmPin,LOW);
  if (digitalRead(keys))
  {
    switchState = 1;
  }
  else
  {
    switchState = 0;
  }
  previousSwitchState = switchState;
 // tone(alarmPin,1024);
}
void loop()
{
  if(analogRead(A3) > 600)
  {
    digitalWrite(motionSensor,HIGH);
  }
  else
  {
    digitalWrite(motionSensor,LOW);
  }
    
  if(!digitalRead(ifDoorOpen))
  {
    tone(alarmPin,1024);
  }
  else
  {
    noTone(alarmPin);
  }
  
  temp = ((analogRead(A5) * (5000.0 / 1023.0)) - 500) / 10 + 3;
  a = constrain (analogRead(A4), 125, 1017);
  b = constrain (analogRead(A1), 210, 1012);
  c = constrain (analogRead(A2), 170, 1014);
  light1 = map(a, 125, 1017, 255, 0);
  light2 = map(b, 210, 1012, 255, 0);
  light3 = map(c, 170, 1017, 255, 0);
  ifCurrent = digitalRead(keys);
  if(ifCurrent)
  {
    switchState = 1;
  }
  else
  {
    switchState = 0;
  }
  if (Serial.available())
  {
    
    val = Serial.read();
    // При символе "1" включаем светодиод

    switch (val)
    {

    case '0':
    {
    
      ifRoom1 = false;
      break;
    }

    case '1':
    {
      ifRoom1 = true;
      break;
    }

    case '2':
    {
      ifRoom2 = false;
      break;
    }

    case '3':
    {
      ifRoom2 = true;
      break;
    }

    case '4':
    {
      ifRoom3 = false;
      break;
    }

    case '5':
    {
      ifRoom3 = true;
      break;
    }
    }
    

  }

  if (ifRoom1)
  {
    analogWrite(room1, light1);
  }
  else
  {
    digitalWrite(room1, LOW);
  }

  if (ifRoom2)
  {
    analogWrite(room2, light2);
    digitalWrite(lightBulb,HIGH);
  }
  else
  {
    digitalWrite(room2, LOW);
    digitalWrite(lightBulb,LOW);
  }
  if(ifRoom3)
  {
    analogWrite(room3,light3);
  }
  else
  {
    digitalWrite(room3,LOW);
  }

//  if (ifRoom3)
//  {
//   if (switchState != previousSwitchState)
//   {
//    if (switchState == 1)
//    {
//    analogWrite(room3, light3);
// 
//    }
//    else 
//    {
//    digitalWrite(room3, LOW);
//    ifRoom3 = false;
//    }
//   }
//   else
//    analogWrite(room3, light3);
//  }
//  else
//  {
//   if (switchState != previousSwitchState)
//   {
//    if (switchState == 0)
//    {
//    digitalWrite(room3, LOW);
//    }
//    else
//    {
//    analogWrite(room3, light3);
//    ifRoom3 = true;
//    }
//   }
//   else
//      digitalWrite(room3, LOW);
//  }
if (switchState != previousSwitchState)
  {
     if (!ifRoom3)
      {
        analogWrite(room3,light3);
        val = '10';
        ifRoom3 = true;
        
        
      }
      else
      {
        digitalWrite(room3,LOW);
         val = '10';
         ifRoom3 = false;

      }
      previousSwitchState = switchState;
  }
  if (temp>25 || temp <18)
  {
    digitalWrite (heater, LOW);
  }
  else 
  {
    digitalWrite (heater, HIGH);
  }

  
  
  Serial.print(temp);
  Serial.print("\n");
  



  
  delay(500);
}




