package appinventor.ai_sevkorobot.Bluetooh_copy;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.ErrorMessages;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Compilation;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.expr.SetExp;
import gnu.kawa.functions.ArithOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.ParseFormat;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.Sequence;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import gnu.text.PrettyWriter;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.acra.ACRAConstants;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final FString Lit100;
    static final SimpleSymbol Lit101;
    static final IntNum Lit102;
    static final FString Lit103;
    static final FString Lit104;
    static final SimpleSymbol Lit105;
    static final IntNum Lit106;
    static final FString Lit107;
    static final FString Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final IntNum Lit110;
    static final FString Lit111;
    static final FString Lit112;
    static final SimpleSymbol Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final SimpleSymbol Lit116;
    static final IntNum Lit117;
    static final FString Lit118;
    static final FString Lit119;
    static final IntNum Lit12;
    static final SimpleSymbol Lit120;
    static final FString Lit121;
    static final FString Lit122;
    static final SimpleSymbol Lit123;
    static final IntNum Lit124;
    static final FString Lit125;
    static final FString Lit126;
    static final SimpleSymbol Lit127;
    static final FString Lit128;
    static final SimpleSymbol Lit129;
    static final FString Lit13;
    static final PairWithPosition Lit130;
    static final IntNum Lit131;
    static final SimpleSymbol Lit132;
    static final FString Lit133;
    static final SimpleSymbol Lit134;
    static final IntNum Lit135;
    static final FString Lit136;
    static final FString Lit137;
    static final SimpleSymbol Lit138;
    static final FString Lit139;
    static final FString Lit14;
    static final PairWithPosition Lit140;
    static final IntNum Lit141;
    static final SimpleSymbol Lit142;
    static final FString Lit143;
    static final SimpleSymbol Lit144;
    static final FString Lit145;
    static final PairWithPosition Lit146;
    static final IntNum Lit147;
    static final SimpleSymbol Lit148;
    static final FString Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final FString Lit151;
    static final FString Lit152;
    static final SimpleSymbol Lit153;
    static final IntNum Lit154;
    static final FString Lit155;
    static final FString Lit156;
    static final SimpleSymbol Lit157;
    static final FString Lit158;
    static final PairWithPosition Lit159;
    static final SimpleSymbol Lit16;
    static final IntNum Lit160;
    static final SimpleSymbol Lit161;
    static final FString Lit162;
    static final SimpleSymbol Lit163;
    static final IntNum Lit164;
    static final FString Lit165;
    static final FString Lit166;
    static final SimpleSymbol Lit167;
    static final FString Lit168;
    static final PairWithPosition Lit169;
    static final IntNum Lit17;
    static final IntNum Lit170;
    static final SimpleSymbol Lit171;
    static final FString Lit172;
    static final SimpleSymbol Lit173;
    static final FString Lit174;
    static final PairWithPosition Lit175;
    static final IntNum Lit176;
    static final SimpleSymbol Lit177;
    static final FString Lit178;
    static final SimpleSymbol Lit179;
    static final SimpleSymbol Lit18;
    static final IntNum Lit180;
    static final FString Lit181;
    static final FString Lit182;
    static final SimpleSymbol Lit183;
    static final FString Lit184;
    static final FString Lit185;
    static final SimpleSymbol Lit186;
    static final DFloNum Lit187;
    static final FString Lit188;
    static final FString Lit189;
    static final IntNum Lit19;
    static final SimpleSymbol Lit190;
    static final FString Lit191;
    static final FString Lit192;
    static final SimpleSymbol Lit193;
    static final DFloNum Lit194;
    static final SimpleSymbol Lit195;
    static final IntNum Lit196;
    static final FString Lit197;
    static final FString Lit198;
    static final SimpleSymbol Lit199;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit200;
    static final FString Lit201;
    static final SimpleSymbol Lit202;
    static final SimpleSymbol Lit203;
    static final SimpleSymbol Lit204;
    static final SimpleSymbol Lit205;
    static final SimpleSymbol Lit206;
    static final SimpleSymbol Lit207;
    static final SimpleSymbol Lit208;
    static final PairWithPosition Lit209;
    static final FString Lit21;
    static final SimpleSymbol Lit210;
    static final IntNum Lit211;
    static final IntNum Lit212;
    static final SimpleSymbol Lit213;
    static final SimpleSymbol Lit214;
    static final FString Lit215;
    static final FString Lit216;
    static final FString Lit217;
    static final FString Lit218;
    static final FString Lit219;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit220;
    static final FString Lit221;
    static final FString Lit222;
    static final SimpleSymbol Lit223;
    static final SimpleSymbol Lit224;
    static final IntNum Lit225;
    static final FString Lit226;
    static final SimpleSymbol Lit227;
    static final SimpleSymbol Lit228;
    static final PairWithPosition Lit229;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit230;
    static final SimpleSymbol Lit231;
    static final SimpleSymbol Lit232;
    static final SimpleSymbol Lit233;
    static final SimpleSymbol Lit234;
    static final SimpleSymbol Lit235;
    static final SimpleSymbol Lit236;
    static final SimpleSymbol Lit237;
    static final SimpleSymbol Lit238;
    static final SimpleSymbol Lit239;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit240;
    static final SimpleSymbol Lit241;
    static final SimpleSymbol Lit242;
    static final SimpleSymbol Lit243;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final PairWithPosition Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final FString Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final IntNum Lit34;
    static final IntNum Lit35;
    static final FString Lit36;
    static final FString Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final IntNum Lit40;
    static final IntNum Lit41;
    static final IntNum Lit42;
    static final FString Lit43;
    static final FString Lit44;
    static final SimpleSymbol Lit45;
    static final FString Lit46;
    static final FString Lit47;
    static final SimpleSymbol Lit48;
    static final DFloNum Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final SimpleSymbol Lit51;
    static final IntNum Lit52;
    static final SimpleSymbol Lit53;
    static final FString Lit54;
    static final SimpleSymbol Lit55;
    static final IntNum Lit56;
    static final FString Lit57;
    static final FString Lit58;
    static final SimpleSymbol Lit59;
    static final FString Lit6;
    static final IntNum Lit60;
    static final FString Lit61;
    static final FString Lit62;
    static final SimpleSymbol Lit63;
    static final IntNum Lit64;
    static final FString Lit65;
    static final FString Lit66;
    static final SimpleSymbol Lit67;
    static final IntNum Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70;
    static final SimpleSymbol Lit71;
    static final IntNum Lit72;
    static final IntNum Lit73;
    static final FString Lit74;
    static final FString Lit75;
    static final SimpleSymbol Lit76;
    static final IntNum Lit77;
    static final IntNum Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final FString Lit81;
    static final SimpleSymbol Lit82;
    static final IntNum Lit83;
    static final FString Lit84;
    static final FString Lit85;
    static final SimpleSymbol Lit86;
    static final IntNum Lit87;
    static final FString Lit88;
    static final FString Lit89;
    static final IntNum Lit9;
    static final SimpleSymbol Lit90;
    static final FString Lit91;
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final IntNum Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final IntNum Lit98;
    static final FString Lit99;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn51 = null;
    static final ModuleMethod lambda$Fn52 = null;
    static final ModuleMethod lambda$Fn53 = null;
    static final ModuleMethod lambda$Fn54 = null;
    static final ModuleMethod lambda$Fn55 = null;
    static final ModuleMethod lambda$Fn56 = null;
    static final ModuleMethod lambda$Fn57 = null;
    static final ModuleMethod lambda$Fn58 = null;
    static final ModuleMethod lambda$Fn59 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn60 = null;
    static final ModuleMethod lambda$Fn61 = null;
    static final ModuleMethod lambda$Fn62 = null;
    static final ModuleMethod lambda$Fn63 = null;
    static final ModuleMethod lambda$Fn64 = null;
    static final ModuleMethod lambda$Fn65 = null;
    static final ModuleMethod lambda$Fn66 = null;
    static final ModuleMethod lambda$Fn67 = null;
    static final ModuleMethod lambda$Fn68 = null;
    static final ModuleMethod lambda$Fn69 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn70 = null;
    static final ModuleMethod lambda$Fn71 = null;
    static final ModuleMethod lambda$Fn72 = null;
    static final ModuleMethod lambda$Fn73 = null;
    static final ModuleMethod lambda$Fn74 = null;
    static final ModuleMethod lambda$Fn75 = null;
    static final ModuleMethod lambda$Fn76 = null;
    static final ModuleMethod lambda$Fn77 = null;
    static final ModuleMethod lambda$Fn78 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter ActivityStarter1;
    public BluetoothClient BluetoothClient1;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button3;
    public final ModuleMethod Button3$Click;
    public Button Button4;
    public final ModuleMethod Button4$Click;
    public Button Button5;
    public final ModuleMethod Button5$Click;
    public Button Button6;
    public final ModuleMethod Button6$Click;
    public Button Button7;
    public final ModuleMethod Button7$Click;
    public Button Button8;
    public final ModuleMethod Button8$Click;
    public Button Button9;
    public final ModuleMethod Button9$Click;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public ListPicker ListPicker1;
    public final ModuleMethod ListPicker1$AfterPicking;
    public final ModuleMethod ListPicker1$BeforePicking;
    public Notifier Notifier1;
    public TextBox TextBox1;
    public TextBox TextBox2;
    public TextBox TextBox3;
    public TextBox TextBox4;
    public VerticalArrangement VerticalArrangement1;
    public VerticalArrangement VerticalArrangement10;
    public VerticalArrangement VerticalArrangement11;
    public VerticalArrangement VerticalArrangement12;
    public VerticalArrangement VerticalArrangement13;
    public VerticalArrangement VerticalArrangement14;
    public VerticalArrangement VerticalArrangement15;
    public VerticalArrangement VerticalArrangement16;
    public VerticalArrangement VerticalArrangement17;
    public VerticalArrangement VerticalArrangement2;
    public VerticalArrangement VerticalArrangement3;
    public VerticalArrangement VerticalArrangement4;
    public VerticalArrangement VerticalArrangement5;
    public VerticalArrangement VerticalArrangement6;
    public VerticalArrangement VerticalArrangement7;
    public VerticalArrangement VerticalArrangement8;
    public VerticalArrangement VerticalArrangement9;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_LEFT /*10*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT /*6*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.IOR /*14*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case ArithOp.AND /*13*/:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_LEFT /*10*/:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    this.$main.sendError(obj);
                    return Values.empty;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case ArithOp.AND /*13*/:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT /*6*/:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case ArithOp.IOR /*14*/:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    return Screen1.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Screen1.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return Screen1.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Screen1.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Screen1.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return Screen1.lambda7();
                case Sequence.INT_S32_VALUE /*22*/:
                    return this.$main.Button1$Click();
                case Sequence.INT_U64_VALUE /*23*/:
                    return Screen1.lambda8();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Screen1.lambda9();
                case Sequence.FLOAT_VALUE /*25*/:
                    return Screen1.lambda10();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return Screen1.lambda11();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Screen1.lambda12();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Screen1.lambda13();
                case Sequence.CHAR_VALUE /*29*/:
                    return Screen1.lambda14();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Screen1.lambda15();
                case Sequence.CDATA_VALUE /*31*/:
                    return this.$main.Button3$Click();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return Screen1.lambda16();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Screen1.lambda17();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Screen1.lambda18();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Screen1.lambda19();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Screen1.lambda20();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Screen1.lambda21();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Screen1.lambda22();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return Screen1.lambda23();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return Screen1.lambda24();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Screen1.lambda25();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Screen1.lambda26();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Screen1.lambda27();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Screen1.lambda28();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return Screen1.lambda29();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return Screen1.lambda30();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Screen1.lambda31();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return Screen1.lambda32();
                case 49:
                    return Screen1.lambda33();
                case 50:
                    return Screen1.lambda34();
                case 51:
                    return Screen1.lambda35();
                case 52:
                    return Screen1.lambda36();
                case 53:
                    return Screen1.lambda37();
                case 54:
                    return Screen1.lambda38();
                case 55:
                    return Screen1.lambda39();
                case 56:
                    return Screen1.lambda40();
                case 57:
                    return Screen1.lambda41();
                case 58:
                    return Screen1.lambda42();
                case 59:
                    return Screen1.lambda43();
                case 60:
                    return Screen1.lambda44();
                case 61:
                    return Screen1.lambda45();
                case 62:
                    return Screen1.lambda46();
                case 63:
                    return Screen1.lambda47();
                case SetExp.HAS_VALUE /*64*/:
                    return Screen1.lambda48();
                case 65:
                    return Screen1.lambda49();
                case 66:
                    return Screen1.lambda50();
                case 67:
                    return Screen1.lambda51();
                case 68:
                    return this.$main.Button5$Click();
                case 69:
                    return Screen1.lambda52();
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    return Screen1.lambda53();
                case 71:
                    return Screen1.lambda54();
                case 72:
                    return Screen1.lambda55();
                case 73:
                    return this.$main.Button6$Click();
                case 74:
                    return Screen1.lambda56();
                case 75:
                    return Screen1.lambda57();
                case PrettyWriter.NEWLINE_LITERAL /*76*/:
                    return this.$main.Button4$Click();
                case PrettyWriter.NEWLINE_MISER /*77*/:
                    return Screen1.lambda58();
                case PrettyWriter.NEWLINE_LINEAR /*78*/:
                    return Screen1.lambda59();
                case 79:
                    return Screen1.lambda60();
                case 80:
                    return Screen1.lambda61();
                case 81:
                    return this.$main.Button8$Click();
                case PrettyWriter.NEWLINE_MANDATORY /*82*/:
                    return Screen1.lambda62();
                case PrettyWriter.NEWLINE_SPACE /*83*/:
                    return Screen1.lambda63();
                case 84:
                    return Screen1.lambda64();
                case 85:
                    return Screen1.lambda65();
                case 86:
                    return this.$main.Button9$Click();
                case 87:
                    return Screen1.lambda66();
                case 88:
                    return Screen1.lambda67();
                case 89:
                    return this.$main.Button7$Click();
                case 90:
                    return Screen1.lambda68();
                case 91:
                    return Screen1.lambda69();
                case 92:
                    return Screen1.lambda70();
                case 93:
                    return Screen1.lambda71();
                case 94:
                    return Screen1.lambda72();
                case 95:
                    return Screen1.lambda73();
                case 96:
                    return Screen1.lambda74();
                case 97:
                    return Screen1.lambda75();
                case 98:
                    return Screen1.lambda76();
                case 99:
                    return Screen1.lambda77();
                case Compilation.ERROR_SEEN /*100*/:
                    return this.$main.ListPicker1$BeforePicking();
                case ErrorMessages.ERROR_LOCATION_SENSOR_LATITUDE_NOT_FOUND /*101*/:
                    return this.$main.ListPicker1$AfterPicking();
                case ErrorMessages.ERROR_LOCATION_SENSOR_LONGITUDE_NOT_FOUND /*102*/:
                    return Screen1.lambda78();
                case 103:
                    return Screen1.lambda79();
                case 104:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.PROCEDURE /*16*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U8_VALUE /*17*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S8_VALUE /*18*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U16_VALUE /*19*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S16_VALUE /*20*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U32_VALUE /*21*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S32_VALUE /*22*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U64_VALUE /*23*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S64_VALUE /*24*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.FLOAT_VALUE /*25*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOUBLE_VALUE /*26*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.BOOLEAN_VALUE /*27*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CHAR_VALUE /*29*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CDATA_VALUE /*31*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.SET_IF_UNBOUND /*32*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ELEMENT_VALUE /*33*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOCUMENT_VALUE /*34*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.COMMENT_VALUE /*36*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.STRING_TYPE_CODE /*38*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NAME_TYPE_CODE /*43*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ID_TYPE_CODE /*45*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.HAS_VALUE /*64*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 74:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 75:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_LITERAL /*76*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_MISER /*77*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_LINEAR /*78*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 79:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 80:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 81:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_MANDATORY /*82*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_SPACE /*83*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 84:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 85:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 86:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 87:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 88:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 89:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 90:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 91:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 92:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 93:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 94:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 95:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 96:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 97:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 98:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 99:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Compilation.ERROR_SEEN /*100*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case ErrorMessages.ERROR_LOCATION_SENSOR_LATITUDE_NOT_FOUND /*101*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case ErrorMessages.ERROR_LOCATION_SENSOR_LONGITUDE_NOT_FOUND /*102*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 103:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 104:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit243 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit242 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit241 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit240 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit239 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit238 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit237 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit236 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit235 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit234 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit233 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit232 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit231 = (SimpleSymbol) new SimpleSymbol("Timer").readResolve();
        Lit230 = (SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit10 = simpleSymbol;
        Lit229 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1683728);
        Lit228 = (SimpleSymbol) new SimpleSymbol("BytesAvailableToReceive").readResolve();
        Lit227 = (SimpleSymbol) new SimpleSymbol("ReceiveText").readResolve();
        Lit226 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit225 = IntNum.make((int) ACRAConstants.DEFAULT_SOCKET_TIMEOUT);
        Lit224 = (SimpleSymbol) new SimpleSymbol("TimerInterval").readResolve();
        Lit223 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
        Lit222 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit221 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit220 = (SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve();
        Lit219 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit218 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit217 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit216 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit215 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit214 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit213 = (SimpleSymbol) new SimpleSymbol("ListPicker1$AfterPicking").readResolve();
        Lit212 = IntNum.make((int) Component.COLOR_RED);
        Lit211 = IntNum.make(-13369549);
        Lit210 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit209 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1585275);
        Lit208 = (SimpleSymbol) new SimpleSymbol("Selection").readResolve();
        Lit207 = (SimpleSymbol) new SimpleSymbol("Connect").readResolve();
        Lit206 = (SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve();
        Lit205 = (SimpleSymbol) new SimpleSymbol("ListPicker1$BeforePicking").readResolve();
        Lit204 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit203 = (SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve();
        Lit202 = (SimpleSymbol) new SimpleSymbol("Elements").readResolve();
        Lit201 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit200 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit199 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit198 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit197 = new FString("com.google.appinventor.components.runtime.Label");
        Lit196 = IntNum.make(1);
        Lit195 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit194 = DFloNum.make((double) 20);
        Lit193 = (SimpleSymbol) new SimpleSymbol("Label4").readResolve();
        Lit192 = new FString("com.google.appinventor.components.runtime.Label");
        Lit191 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit190 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement16").readResolve();
        Lit189 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit188 = new FString("com.google.appinventor.components.runtime.Label");
        Lit187 = DFloNum.make((double) 20);
        Lit186 = (SimpleSymbol) new SimpleSymbol("Label5").readResolve();
        Lit185 = new FString("com.google.appinventor.components.runtime.Label");
        Lit184 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit183 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement17").readResolve();
        Lit182 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit181 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit180 = IntNum.make(-1100);
        Lit179 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve();
        Lit178 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit177 = (SimpleSymbol) new SimpleSymbol("Button7$Click").readResolve();
        Lit176 = IntNum.make((int) Component.COLOR_RED);
        Lit175 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1355858);
        Lit174 = new FString("com.google.appinventor.components.runtime.Button");
        Lit173 = (SimpleSymbol) new SimpleSymbol("Button7").readResolve();
        Lit172 = new FString("com.google.appinventor.components.runtime.Button");
        Lit171 = (SimpleSymbol) new SimpleSymbol("Button9$Click").readResolve();
        Lit170 = IntNum.make((int) Component.COLOR_RED);
        Lit169 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1318994);
        Lit168 = new FString("com.google.appinventor.components.runtime.Button");
        Lit167 = (SimpleSymbol) new SimpleSymbol("Button9").readResolve();
        Lit166 = new FString("com.google.appinventor.components.runtime.Button");
        Lit165 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit164 = IntNum.make(-1035);
        Lit163 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement8").readResolve();
        Lit162 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit161 = (SimpleSymbol) new SimpleSymbol("Button8$Click").readResolve();
        Lit160 = IntNum.make((int) Component.COLOR_RED);
        Lit159 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1253458);
        Lit158 = new FString("com.google.appinventor.components.runtime.Button");
        Lit157 = (SimpleSymbol) new SimpleSymbol("Button8").readResolve();
        Lit156 = new FString("com.google.appinventor.components.runtime.Button");
        Lit155 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit154 = IntNum.make(-1040);
        Lit153 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement7").readResolve();
        Lit152 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit151 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit150 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve();
        Lit149 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit148 = (SimpleSymbol) new SimpleSymbol("Button4$Click").readResolve();
        Lit147 = IntNum.make(-13369549);
        Lit146 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1167442);
        Lit145 = new FString("com.google.appinventor.components.runtime.Button");
        Lit144 = (SimpleSymbol) new SimpleSymbol("Button4").readResolve();
        Lit143 = new FString("com.google.appinventor.components.runtime.Button");
        Lit142 = (SimpleSymbol) new SimpleSymbol("Button6$Click").readResolve();
        Lit141 = IntNum.make(-13369549);
        Lit140 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1130578);
        Lit139 = new FString("com.google.appinventor.components.runtime.Button");
        Lit138 = (SimpleSymbol) new SimpleSymbol("Button6").readResolve();
        Lit137 = new FString("com.google.appinventor.components.runtime.Button");
        Lit136 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit135 = IntNum.make(-1035);
        Lit134 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement6").readResolve();
        Lit133 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit132 = (SimpleSymbol) new SimpleSymbol("Button5$Click").readResolve();
        Lit131 = IntNum.make(-13369549);
        Lit130 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 1065042);
        Lit129 = (SimpleSymbol) new SimpleSymbol("SendText").readResolve();
        Lit128 = new FString("com.google.appinventor.components.runtime.Button");
        Lit127 = (SimpleSymbol) new SimpleSymbol("Button5").readResolve();
        Lit126 = new FString("com.google.appinventor.components.runtime.Button");
        Lit125 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit124 = IntNum.make(-1040);
        Lit123 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement5").readResolve();
        Lit122 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit121 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit120 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve();
        Lit119 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit118 = new FString("com.google.appinventor.components.runtime.TextBox");
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_RED;
        Lit117 = IntNum.make(iArr);
        Lit116 = (SimpleSymbol) new SimpleSymbol("TextBox2").readResolve();
        Lit115 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit114 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit113 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement14").readResolve();
        Lit112 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit111 = new FString("com.google.appinventor.components.runtime.Label");
        Lit110 = IntNum.make(-1060);
        Lit109 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit108 = new FString("com.google.appinventor.components.runtime.Label");
        Lit107 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit106 = IntNum.make(-1020);
        Lit105 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement13").readResolve();
        Lit104 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit103 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit102 = IntNum.make(-1008);
        Lit101 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement12").readResolve();
        Lit100 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit99 = new FString("com.google.appinventor.components.runtime.TextBox");
        iArr = new int[2];
        iArr[0] = Component.COLOR_GREEN;
        Lit98 = IntNum.make(iArr);
        Lit97 = (SimpleSymbol) new SimpleSymbol("TextBox3").readResolve();
        Lit96 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit95 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit94 = IntNum.make(25);
        Lit93 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement11").readResolve();
        Lit92 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit91 = new FString("com.google.appinventor.components.runtime.Label");
        Lit90 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit89 = new FString("com.google.appinventor.components.runtime.Label");
        Lit88 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit87 = IntNum.make(-1020);
        Lit86 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement2").readResolve();
        Lit85 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit84 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit83 = IntNum.make(37);
        Lit82 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement10").readResolve();
        Lit81 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit80 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit79 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit78 = IntNum.make(10);
        iArr = new int[2];
        iArr[0] = Component.COLOR_GREEN;
        Lit77 = IntNum.make(iArr);
        Lit76 = (SimpleSymbol) new SimpleSymbol("TextBox1").readResolve();
        Lit75 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit74 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit73 = IntNum.make(20);
        Lit72 = IntNum.make(30);
        Lit71 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement9").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit69 = new FString("com.google.appinventor.components.runtime.Label");
        Lit68 = IntNum.make(16);
        Lit67 = (SimpleSymbol) new SimpleSymbol("Label3").readResolve();
        Lit66 = new FString("com.google.appinventor.components.runtime.Label");
        Lit65 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit64 = IntNum.make(-1020);
        Lit63 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement4").readResolve();
        Lit62 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit61 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit60 = IntNum.make(500);
        Lit59 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit58 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit57 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit56 = IntNum.make(700);
        Lit55 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement3").readResolve();
        Lit54 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit53 = (SimpleSymbol) new SimpleSymbol("Button3$Click").readResolve();
        Lit52 = IntNum.make((int) Component.COLOR_RED);
        Lit51 = (SimpleSymbol) new SimpleSymbol("Disconnect").readResolve();
        Lit50 = new FString("com.google.appinventor.components.runtime.Button");
        Lit49 = DFloNum.make((double) 15);
        Lit48 = (SimpleSymbol) new SimpleSymbol("Button3").readResolve();
        Lit47 = new FString("com.google.appinventor.components.runtime.Button");
        Lit46 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit45 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit44 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit43 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit42 = IntNum.make(-1015);
        Lit41 = IntNum.make(-1005);
        iArr = new int[2];
        iArr[0] = Component.COLOR_RED;
        Lit40 = IntNum.make(iArr);
        Lit39 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("TextBox4").readResolve();
        Lit37 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit36 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit35 = IntNum.make(50);
        Lit34 = IntNum.make(2);
        Lit33 = (SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement15").readResolve();
        Lit31 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit30 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve();
        Lit28 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1474488050885_0.28181464858318406-0/youngandroidproject/../src/appinventor/ai_sevkorobot/Bluetooh_copy/Screen1.yail", 151815);
        Lit27 = (SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve();
        Lit26 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit25 = (SimpleSymbol) new SimpleSymbol("Open").readResolve();
        Lit24 = (SimpleSymbol) new SimpleSymbol("ListPicker1").readResolve();
        Lit23 = (SimpleSymbol) new SimpleSymbol("Enabled").readResolve();
        Lit22 = (SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve();
        Lit21 = new FString("com.google.appinventor.components.runtime.Button");
        Lit20 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit19 = IntNum.make(100);
        Lit18 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit17 = IntNum.make(15);
        Lit16 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("Button1").readResolve();
        Lit14 = new FString("com.google.appinventor.components.runtime.Button");
        Lit13 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit12 = IntNum.make(-1100);
        Lit11 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit9 = IntNum.make(3);
        Lit8 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit6 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit5 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Screen1").readResolve();
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame = new frame();
        appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 1, Lit232, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 2, Lit233, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 3, Lit234, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 5, Lit235, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 6, Lit236, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 7, Lit237, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 8, Lit238, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 9, Lit239, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 10, Lit240, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 11, Lit241, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 13, Lit242, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 14, Lit243, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3124200614498228799.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 21, null, 0);
        this.Button1$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 22, Lit29, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 28, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 29, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 30, null, 0);
        this.Button3$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 31, Lit53, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 33, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 34, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 35, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 36, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 37, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 38, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 39, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 40, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 41, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 42, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 43, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 44, null, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 45, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 46, null, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 47, null, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 48, null, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 49, null, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 50, null, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 51, null, 0);
        lambda$Fn35 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 52, null, 0);
        lambda$Fn36 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 53, null, 0);
        lambda$Fn37 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 54, null, 0);
        lambda$Fn38 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 55, null, 0);
        lambda$Fn39 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 56, null, 0);
        lambda$Fn40 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 57, null, 0);
        lambda$Fn41 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 58, null, 0);
        lambda$Fn42 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 59, null, 0);
        lambda$Fn43 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 60, null, 0);
        lambda$Fn44 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 61, null, 0);
        lambda$Fn45 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 62, null, 0);
        lambda$Fn46 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 63, null, 0);
        lambda$Fn47 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 64, null, 0);
        lambda$Fn48 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 65, null, 0);
        lambda$Fn49 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 66, null, 0);
        lambda$Fn50 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 67, null, 0);
        this.Button5$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 68, Lit132, 0);
        lambda$Fn51 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 69, null, 0);
        lambda$Fn52 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 70, null, 0);
        lambda$Fn53 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 71, null, 0);
        lambda$Fn54 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 72, null, 0);
        this.Button6$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 73, Lit142, 0);
        lambda$Fn55 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 74, null, 0);
        lambda$Fn56 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 75, null, 0);
        this.Button4$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 76, Lit148, 0);
        lambda$Fn57 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 77, null, 0);
        lambda$Fn58 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 78, null, 0);
        lambda$Fn59 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 79, null, 0);
        lambda$Fn60 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 80, null, 0);
        this.Button8$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 81, Lit161, 0);
        lambda$Fn61 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 82, null, 0);
        lambda$Fn62 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 83, null, 0);
        lambda$Fn63 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 84, null, 0);
        lambda$Fn64 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 85, null, 0);
        this.Button9$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 86, Lit171, 0);
        lambda$Fn65 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 87, null, 0);
        lambda$Fn66 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 88, null, 0);
        this.Button7$Click = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 89, Lit177, 0);
        lambda$Fn67 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 90, null, 0);
        lambda$Fn68 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 91, null, 0);
        lambda$Fn69 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 92, null, 0);
        lambda$Fn70 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 93, null, 0);
        lambda$Fn71 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 94, null, 0);
        lambda$Fn72 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 95, null, 0);
        lambda$Fn73 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 96, null, 0);
        lambda$Fn74 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 97, null, 0);
        lambda$Fn75 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 98, null, 0);
        lambda$Fn76 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 99, null, 0);
        this.ListPicker1$BeforePicking = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 100, Lit205, 0);
        this.ListPicker1$AfterPicking = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, ErrorMessages.ERROR_LOCATION_SENSOR_LATITUDE_NOT_FOUND, Lit213, 0);
        lambda$Fn77 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, ErrorMessages.ERROR_LOCATION_SENSOR_LONGITUDE_NOT_FOUND, null, 0);
        lambda$Fn78 = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 103, null, 0);
        this.Clock1$Timer = new ModuleMethod(appinventor_ai_sevkorobot_Bluetooh_copy_Screen1_frame, 104, Lit230, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Bluetooh", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "v1_bluetooh", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit6, Lit7, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit13, Lit7, lambda$Fn4);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit14, Lit15, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit7, Lit21, Lit15, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit29, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit29, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit15, Lit30);
                }
                this.VerticalArrangement15 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit31, Lit32, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit7, Lit36, Lit32, lambda$Fn8);
                }
                this.TextBox4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit32, Lit37, Lit38, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit32, Lit43, Lit38, lambda$Fn10);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit44, Lit45, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit7, Lit46, Lit45, lambda$Fn12);
                }
                this.Button3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit45, Lit47, Lit48, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit45, Lit50, Lit48, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit53, this.Button3$Click);
                } else {
                    addToFormEnvironment(Lit53, this.Button3$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button3", "Click");
                } else {
                    addToEvents(Lit48, Lit30);
                }
                this.VerticalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit54, Lit55, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit57, Lit55, lambda$Fn16);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit55, Lit58, Lit59, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit55, Lit61, Lit59, lambda$Fn18);
                }
                this.VerticalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit62, Lit63, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit59, Lit65, Lit63, lambda$Fn20);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit63, Lit66, Lit67, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit63, Lit69, Lit67, lambda$Fn22);
                }
                this.VerticalArrangement9 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit70, Lit71, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit59, Lit74, Lit71, lambda$Fn24);
                }
                this.TextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit75, Lit76, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit71, Lit80, Lit76, lambda$Fn26);
                }
                this.VerticalArrangement10 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit81, Lit82, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit59, Lit84, Lit82, lambda$Fn28);
                }
                this.VerticalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit85, Lit86, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit59, Lit88, Lit86, lambda$Fn30);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit86, Lit89, Lit90, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit86, Lit91, Lit90, lambda$Fn32);
                }
                this.VerticalArrangement11 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit92, Lit93, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit59, Lit95, Lit93, lambda$Fn34);
                }
                this.TextBox3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit93, Lit96, Lit97, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit93, Lit99, Lit97, lambda$Fn36);
                }
                this.VerticalArrangement12 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit100, Lit101, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit59, Lit103, Lit101, lambda$Fn38);
                }
                this.VerticalArrangement13 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit104, Lit105, lambda$Fn39), $result);
                } else {
                    addToComponents(Lit59, Lit107, Lit105, lambda$Fn40);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit105, Lit108, Lit109, lambda$Fn41), $result);
                } else {
                    addToComponents(Lit105, Lit111, Lit109, lambda$Fn42);
                }
                this.VerticalArrangement14 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit112, Lit113, lambda$Fn43), $result);
                } else {
                    addToComponents(Lit59, Lit114, Lit113, lambda$Fn44);
                }
                this.TextBox2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit113, Lit115, Lit116, lambda$Fn45), $result);
                } else {
                    addToComponents(Lit113, Lit118, Lit116, lambda$Fn46);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit119, Lit120, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit121, Lit120, Boolean.FALSE);
                }
                this.VerticalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit120, Lit122, Lit123, lambda$Fn47), $result);
                } else {
                    addToComponents(Lit120, Lit125, Lit123, lambda$Fn48);
                }
                this.Button5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit123, Lit126, Lit127, lambda$Fn49), $result);
                } else {
                    addToComponents(Lit123, Lit128, Lit127, lambda$Fn50);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit132, this.Button5$Click);
                } else {
                    addToFormEnvironment(Lit132, this.Button5$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button5", "Click");
                } else {
                    addToEvents(Lit127, Lit30);
                }
                this.VerticalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit120, Lit133, Lit134, lambda$Fn51), $result);
                } else {
                    addToComponents(Lit120, Lit136, Lit134, lambda$Fn52);
                }
                this.Button6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit134, Lit137, Lit138, lambda$Fn53), $result);
                } else {
                    addToComponents(Lit134, Lit139, Lit138, lambda$Fn54);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit142, this.Button6$Click);
                } else {
                    addToFormEnvironment(Lit142, this.Button6$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button6", "Click");
                } else {
                    addToEvents(Lit138, Lit30);
                }
                this.Button4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit120, Lit143, Lit144, lambda$Fn55), $result);
                } else {
                    addToComponents(Lit120, Lit145, Lit144, lambda$Fn56);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit148, this.Button4$Click);
                } else {
                    addToFormEnvironment(Lit148, this.Button4$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button4", "Click");
                } else {
                    addToEvents(Lit144, Lit30);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit149, Lit150, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit151, Lit150, Boolean.FALSE);
                }
                this.VerticalArrangement7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit150, Lit152, Lit153, lambda$Fn57), $result);
                } else {
                    addToComponents(Lit150, Lit155, Lit153, lambda$Fn58);
                }
                this.Button8 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit153, Lit156, Lit157, lambda$Fn59), $result);
                } else {
                    addToComponents(Lit153, Lit158, Lit157, lambda$Fn60);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit161, this.Button8$Click);
                } else {
                    addToFormEnvironment(Lit161, this.Button8$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button8", "Click");
                } else {
                    addToEvents(Lit157, Lit30);
                }
                this.VerticalArrangement8 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit150, Lit162, Lit163, lambda$Fn61), $result);
                } else {
                    addToComponents(Lit150, Lit165, Lit163, lambda$Fn62);
                }
                this.Button9 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit163, Lit166, Lit167, lambda$Fn63), $result);
                } else {
                    addToComponents(Lit163, Lit168, Lit167, lambda$Fn64);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit171, this.Button9$Click);
                } else {
                    addToFormEnvironment(Lit171, this.Button9$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button9", "Click");
                } else {
                    addToEvents(Lit167, Lit30);
                }
                this.Button7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit150, Lit172, Lit173, lambda$Fn65), $result);
                } else {
                    addToComponents(Lit150, Lit174, Lit173, lambda$Fn66);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit177, this.Button7$Click);
                } else {
                    addToFormEnvironment(Lit177, this.Button7$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button7", "Click");
                } else {
                    addToEvents(Lit173, Lit30);
                }
                this.HorizontalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit178, Lit179, lambda$Fn67), $result);
                } else {
                    addToComponents(Lit0, Lit181, Lit179, lambda$Fn68);
                }
                this.VerticalArrangement17 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit179, Lit182, Lit183, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit179, Lit184, Lit183, Boolean.FALSE);
                }
                this.Label5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit183, Lit185, Lit186, lambda$Fn69), $result);
                } else {
                    addToComponents(Lit183, Lit188, Lit186, lambda$Fn70);
                }
                this.VerticalArrangement16 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit179, Lit189, Lit190, lambda$Fn71), $result);
                } else {
                    addToComponents(Lit179, Lit191, Lit190, lambda$Fn72);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit190, Lit192, Lit193, lambda$Fn73), $result);
                } else {
                    addToComponents(Lit190, Lit197, Lit193, lambda$Fn74);
                }
                this.ListPicker1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit198, Lit24, lambda$Fn75), $result);
                } else {
                    addToComponents(Lit0, Lit201, Lit24, lambda$Fn76);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit205, this.ListPicker1$BeforePicking);
                } else {
                    addToFormEnvironment(Lit205, this.ListPicker1$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "BeforePicking");
                } else {
                    addToEvents(Lit24, Lit206);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit213, this.ListPicker1$AfterPicking);
                } else {
                    addToFormEnvironment(Lit213, this.ListPicker1$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "AfterPicking");
                } else {
                    addToEvents(Lit24, Lit214);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit215, Lit22, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit216, Lit22, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit217, Lit26, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit218, Lit26, Boolean.FALSE);
                }
                this.ActivityStarter1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit219, Lit220, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit221, Lit220, Boolean.FALSE);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit222, Lit223, lambda$Fn77), $result);
                } else {
                    addToComponents(Lit0, Lit226, Lit223, lambda$Fn78);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit230, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit230, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit223, Lit231);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Bluetooh", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "v1_bluetooh", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit11, Lit12, Lit10);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit11, Lit12, Lit10);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit16, Lit17, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit15, Lit18, Lit19, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit15, Lit11, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit20, "Connect", Lit4);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit15, Lit16, Lit17, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit15, Lit18, Lit19, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit15, Lit11, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit15, Lit20, "Connect", Lit4);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.getProperty$1(Lit22, Lit23) != Boolean.FALSE ? runtime.callComponentMethod(Lit24, Lit25, LList.Empty, LList.Empty) : runtime.callComponentMethod(Lit26, Lit27, LList.list1("Bluetooth is not enabled - enable bluetooth in settings"), Lit28);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit18, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit11, Lit35, Lit10);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit18, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit11, Lit35, Lit10);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit40, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit18, Lit41, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit11, Lit42, Lit10);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit40, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit18, Lit41, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit11, Lit42, Lit10);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit18, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit11, Lit19, Lit10);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit18, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit11, Lit19, Lit10);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit16, Lit49, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit18, Lit19, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit11, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit20, "Disconnect", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit16, Lit49, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit18, Lit19, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit11, Lit19, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit20, "Disconnect", Lit4);
    }

    public Object Button3$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit51, LList.Empty, LList.Empty);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit52, Lit10);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit11, Lit56, Lit10);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit11, Lit56, Lit10);
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit11, Lit60, Lit10);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit11, Lit60, Lit10);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit63, Lit11, Lit64, Lit10);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit63, Lit11, Lit64, Lit10);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit67, Lit16, Lit68, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit67, Lit20, "Room 1", Lit4);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit67, Lit16, Lit68, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit67, Lit20, "Room 1", Lit4);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit11, Lit73, Lit10);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit11, Lit73, Lit10);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit39, Lit77, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit18, Lit78, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit11, Lit73, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit79, "box", Lit4);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit76, Lit39, Lit77, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit18, Lit78, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit76, Lit11, Lit73, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit79, "box", Lit4);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit18, Lit78, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit11, Lit83, Lit10);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit18, Lit78, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit11, Lit83, Lit10);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit11, Lit87, Lit10);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit86, Lit11, Lit87, Lit10);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit16, Lit68, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit20, "Room 2", Lit4);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit16, Lit68, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit20, "Room 2", Lit4);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit11, Lit94, Lit10);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit11, Lit94, Lit10);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit39, Lit98, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit18, Lit78, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit11, Lit73, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit79, "Hint for TextBox3", Lit4);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit97, Lit39, Lit98, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit18, Lit78, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit97, Lit11, Lit73, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit79, "Hint for TextBox3", Lit4);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit18, Lit78, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit11, Lit102, Lit10);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit101, Lit18, Lit78, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit11, Lit102, Lit10);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit105, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit11, Lit106, Lit10);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit105, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit11, Lit106, Lit10);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit109, Lit16, Lit68, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit11, Lit110, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit20, "Room 3", Lit4);
    }

    static Object lambda43() {
        runtime.setAndCoerceProperty$Ex(Lit109, Lit16, Lit68, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit109, Lit11, Lit110, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit20, "Room 3", Lit4);
    }

    static Object lambda44() {
        runtime.setAndCoerceProperty$Ex(Lit113, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit11, Lit73, Lit10);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit113, Lit33, Lit34, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit113, Lit18, Lit72, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit113, Lit11, Lit73, Lit10);
    }

    static Object lambda46() {
        runtime.setAndCoerceProperty$Ex(Lit116, Lit39, Lit117, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit116, Lit18, Lit78, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit116, Lit11, Lit73, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit79, "Hint for TextBox2", Lit4);
    }

    static Object lambda47() {
        runtime.setAndCoerceProperty$Ex(Lit116, Lit39, Lit117, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit116, Lit18, Lit78, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit116, Lit11, Lit73, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit79, "Hint for TextBox2", Lit4);
    }

    static Object lambda48() {
        return runtime.setAndCoerceProperty$Ex(Lit123, Lit11, Lit124, Lit10);
    }

    static Object lambda49() {
        return runtime.setAndCoerceProperty$Ex(Lit123, Lit11, Lit124, Lit10);
    }

    static Object lambda50() {
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit20, "On", Lit4);
    }

    static Object lambda51() {
        return runtime.setAndCoerceProperty$Ex(Lit127, Lit20, "On", Lit4);
    }

    public Object Button5$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit129, LList.list1("1"), Lit130);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit39, Lit131, Lit10);
    }

    static Object lambda52() {
        return runtime.setAndCoerceProperty$Ex(Lit134, Lit11, Lit135, Lit10);
    }

    static Object lambda53() {
        return runtime.setAndCoerceProperty$Ex(Lit134, Lit11, Lit135, Lit10);
    }

    static Object lambda54() {
        return runtime.setAndCoerceProperty$Ex(Lit138, Lit20, "On", Lit4);
    }

    static Object lambda55() {
        return runtime.setAndCoerceProperty$Ex(Lit138, Lit20, "On", Lit4);
    }

    public Object Button6$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit129, LList.list1("3"), Lit140);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit39, Lit141, Lit10);
    }

    static Object lambda56() {
        return runtime.setAndCoerceProperty$Ex(Lit144, Lit20, "On", Lit4);
    }

    static Object lambda57() {
        return runtime.setAndCoerceProperty$Ex(Lit144, Lit20, "On", Lit4);
    }

    public Object Button4$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit129, LList.list1("5"), Lit146);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit39, Lit147, Lit10);
    }

    static Object lambda58() {
        return runtime.setAndCoerceProperty$Ex(Lit153, Lit11, Lit154, Lit10);
    }

    static Object lambda59() {
        return runtime.setAndCoerceProperty$Ex(Lit153, Lit11, Lit154, Lit10);
    }

    static Object lambda60() {
        return runtime.setAndCoerceProperty$Ex(Lit157, Lit20, "Off", Lit4);
    }

    static Object lambda61() {
        return runtime.setAndCoerceProperty$Ex(Lit157, Lit20, "Off", Lit4);
    }

    public Object Button8$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit129, LList.list1("0"), Lit159);
        return runtime.setAndCoerceProperty$Ex(Lit76, Lit39, Lit160, Lit10);
    }

    static Object lambda62() {
        return runtime.setAndCoerceProperty$Ex(Lit163, Lit11, Lit164, Lit10);
    }

    static Object lambda63() {
        return runtime.setAndCoerceProperty$Ex(Lit163, Lit11, Lit164, Lit10);
    }

    static Object lambda64() {
        return runtime.setAndCoerceProperty$Ex(Lit167, Lit20, "Off", Lit4);
    }

    static Object lambda65() {
        return runtime.setAndCoerceProperty$Ex(Lit167, Lit20, "Off", Lit4);
    }

    public Object Button9$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit129, LList.list1("2"), Lit169);
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit39, Lit170, Lit10);
    }

    static Object lambda66() {
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit20, "Off", Lit4);
    }

    static Object lambda67() {
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit20, "Off", Lit4);
    }

    public Object Button7$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit129, LList.list1("4"), Lit175);
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit39, Lit176, Lit10);
    }

    static Object lambda68() {
        runtime.setAndCoerceProperty$Ex(Lit179, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit179, Lit11, Lit180, Lit10);
    }

    static Object lambda69() {
        runtime.setAndCoerceProperty$Ex(Lit179, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit179, Lit11, Lit180, Lit10);
    }

    static Object lambda70() {
        runtime.setAndCoerceProperty$Ex(Lit186, Lit16, Lit187, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit186, Lit20, "Temperature:", Lit4);
    }

    static Object lambda71() {
        runtime.setAndCoerceProperty$Ex(Lit186, Lit16, Lit187, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit186, Lit20, "Temperature:", Lit4);
    }

    static Object lambda72() {
        return runtime.setAndCoerceProperty$Ex(Lit190, Lit8, Lit9, Lit10);
    }

    static Object lambda73() {
        return runtime.setAndCoerceProperty$Ex(Lit190, Lit8, Lit9, Lit10);
    }

    static Object lambda74() {
        runtime.setAndCoerceProperty$Ex(Lit193, Lit16, Lit194, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit193, Lit18, Lit72, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit193, Lit11, Lit35, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit193, Lit195, Lit196, Lit10);
    }

    static Object lambda75() {
        runtime.setAndCoerceProperty$Ex(Lit193, Lit16, Lit194, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit193, Lit18, Lit72, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit193, Lit11, Lit35, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit193, Lit195, Lit196, Lit10);
    }

    static Object lambda76() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit20, "Text for ListPicker1", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit199, Boolean.FALSE, Lit200);
    }

    static Object lambda77() {
        runtime.setAndCoerceProperty$Ex(Lit24, Lit20, "Text for ListPicker1", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit199, Boolean.FALSE, Lit200);
    }

    public Object ListPicker1$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit24, Lit202, runtime.getProperty$1(Lit22, Lit203), Lit204);
    }

    public Object ListPicker1$AfterPicking() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit22, Lit207, LList.list1(runtime.getProperty$1(Lit24, Lit208)), Lit209);
        return runtime.getProperty$1(Lit22, Lit210) != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit211, Lit10) : runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit212, Lit10);
    }

    static Object lambda78() {
        return runtime.setAndCoerceProperty$Ex(Lit223, Lit224, Lit225, Lit10);
    }

    static Object lambda79() {
        return runtime.setAndCoerceProperty$Ex(Lit223, Lit224, Lit225, Lit10);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        return runtime.getProperty$1(Lit22, Lit210) != Boolean.FALSE ? runtime.setAndCoerceProperty$Ex(Lit193, Lit20, runtime.callComponentMethod(Lit22, Lit227, LList.list1(runtime.callComponentMethod(Lit22, Lit228, LList.Empty, LList.Empty)), Lit229), Lit4) : Values.empty;
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Screen1 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
