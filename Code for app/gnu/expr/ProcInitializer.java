package gnu.expr;

import gnu.bytecode.CodeAttr;
import gnu.bytecode.Field;

public class ProcInitializer extends Initializer {
    LambdaExp proc;

    public ProcInitializer(LambdaExp lexp, Compilation comp, Field field) {
        this.field = field;
        this.proc = lexp;
        LambdaExp heapLambda = field.getStaticFlag() ? comp.getModule() : lexp.getOwningLambda();
        if ((heapLambda instanceof ModuleExp) && comp.isStatic()) {
            this.next = comp.clinitChain;
            comp.clinitChain = this;
            return;
        }
        this.next = heapLambda.initChain;
        heapLambda.initChain = this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void emitLoadModuleMethod(gnu.expr.LambdaExp r25, gnu.expr.Compilation r26) {
        /*
        r0 = r25;
        r14 = r0.nameDecl;
        if (r14 != 0) goto L_0x0124;
    L_0x0006:
        r15 = r25.getName();
    L_0x000a:
        r12 = 0;
        r0 = r26;
        r0 = r0.immediate;
        r21 = r0;
        if (r21 == 0) goto L_0x004a;
    L_0x0013:
        if (r15 == 0) goto L_0x004a;
    L_0x0015:
        if (r14 == 0) goto L_0x004a;
    L_0x0017:
        r4 = gnu.mapping.Environment.getCurrent();
        r0 = r15 instanceof gnu.mapping.Symbol;
        r21 = r0;
        if (r21 == 0) goto L_0x012a;
    L_0x0021:
        r21 = r15;
        r21 = (gnu.mapping.Symbol) r21;
        r18 = r21;
    L_0x0027:
        r21 = r26.getLanguage();
        r0 = r25;
        r0 = r0.nameDecl;
        r22 = r0;
        r17 = r21.getEnvPropertyFor(r22);
        r21 = 0;
        r0 = r18;
        r1 = r17;
        r2 = r21;
        r11 = r4.get(r0, r1, r2);
        r0 = r11 instanceof gnu.expr.ModuleMethod;
        r21 = r0;
        if (r21 == 0) goto L_0x004a;
    L_0x0047:
        r12 = r11;
        r12 = (gnu.expr.ModuleMethod) r12;
    L_0x004a:
        r3 = r26.getCode();
        r16 = gnu.expr.Compilation.typeModuleMethod;
        if (r12 != 0) goto L_0x013a;
    L_0x0052:
        r0 = r16;
        r3.emitNew(r0);
        r21 = 1;
        r0 = r21;
        r3.emitDup(r0);
        r7 = "<init>";
    L_0x0060:
        r21 = 4;
        r0 = r16;
        r1 = r21;
        r6 = r0.getDeclaredMethod(r7, r1);
        r21 = r25.getNeedsClosureEnv();
        if (r21 == 0) goto L_0x0149;
    L_0x0070:
        r13 = r25.getOwningLambda();
    L_0x0074:
        r0 = r13 instanceof gnu.expr.ClassExp;
        r21 = r0;
        if (r21 == 0) goto L_0x014f;
    L_0x007a:
        r0 = r13.staticLinkField;
        r21 = r0;
        if (r21 == 0) goto L_0x014f;
    L_0x0080:
        r21 = r3.getCurrentScope();
        r22 = 1;
        r21 = r21.getVariable(r22);
        r0 = r21;
        r3.emitLoad(r0);
    L_0x008f:
        r21 = r25.getSelectorValue(r26);
        r0 = r21;
        r3.emitPushInt(r0);
        r21 = gnu.expr.Target.pushObject;
        r0 = r26;
        r1 = r21;
        r0.compileConstant(r15, r1);
        r0 = r25;
        r0 = r0.min_args;
        r22 = r0;
        r0 = r25;
        r0 = r0.keywords;
        r21 = r0;
        if (r21 != 0) goto L_0x0238;
    L_0x00af:
        r0 = r25;
        r0 = r0.max_args;
        r21 = r0;
    L_0x00b5:
        r21 = r21 << 12;
        r21 = r21 | r22;
        r0 = r21;
        r3.emitPushInt(r0);
        r3.emitInvoke(r6);
        r0 = r25;
        r0 = r0.properties;
        r21 = r0;
        if (r21 == 0) goto L_0x0247;
    L_0x00c9:
        r0 = r25;
        r0 = r0.properties;
        r21 = r0;
        r0 = r21;
        r9 = r0.length;
        r5 = 0;
    L_0x00d3:
        if (r5 >= r9) goto L_0x0247;
    L_0x00d5:
        r0 = r25;
        r0 = r0.properties;
        r21 = r0;
        r8 = r21[r5];
        if (r8 == 0) goto L_0x0121;
    L_0x00df:
        r21 = gnu.mapping.PropertySet.nameKey;
        r0 = r21;
        if (r8 == r0) goto L_0x0121;
    L_0x00e5:
        r0 = r25;
        r0 = r0.properties;
        r21 = r0;
        r22 = r5 + 1;
        r20 = r21[r22];
        r21 = 1;
        r0 = r21;
        r3.emitDup(r0);
        r0 = r26;
        r0.compileConstant(r8);
        r19 = gnu.expr.Target.pushObject;
        r0 = r20;
        r0 = r0 instanceof gnu.expr.Expression;
        r21 = r0;
        if (r21 == 0) goto L_0x023c;
    L_0x0105:
        r20 = (gnu.expr.Expression) r20;
        r0 = r20;
        r1 = r26;
        r2 = r19;
        r0.compile(r1, r2);
    L_0x0110:
        r21 = "gnu.mapping.PropertySet";
        r21 = gnu.bytecode.ClassType.make(r21);
        r22 = "setProperty";
        r23 = 2;
        r10 = r21.getDeclaredMethod(r22, r23);
        r3.emitInvokeVirtual(r10);
    L_0x0121:
        r5 = r5 + 2;
        goto L_0x00d3;
    L_0x0124:
        r15 = r14.getSymbol();
        goto L_0x000a;
    L_0x012a:
        r21 = "";
        r22 = r15.toString();
        r22 = r22.intern();
        r18 = gnu.mapping.Symbol.make(r21, r22);
        goto L_0x0027;
    L_0x013a:
        r21 = gnu.expr.Target.pushValue(r16);
        r0 = r26;
        r1 = r21;
        r0.compileConstant(r12, r1);
        r7 = "init";
        goto L_0x0060;
    L_0x0149:
        r13 = r26.getModule();
        goto L_0x0074;
    L_0x014f:
        r0 = r13 instanceof gnu.expr.ModuleExp;
        r21 = r0;
        if (r21 == 0) goto L_0x0173;
    L_0x0155:
        r0 = r26;
        r0 = r0.moduleClass;
        r21 = r0;
        r0 = r26;
        r0 = r0.mainClass;
        r22 = r0;
        r0 = r21;
        r1 = r22;
        if (r0 != r1) goto L_0x0178;
    L_0x0167:
        r0 = r26;
        r0 = r0.method;
        r21 = r0;
        r21 = r21.getStaticFlag();
        if (r21 != 0) goto L_0x0178;
    L_0x0173:
        r3.emitPushThis();
        goto L_0x008f;
    L_0x0178:
        r0 = r26;
        r0 = r0.moduleInstanceVar;
        r21 = r0;
        if (r21 != 0) goto L_0x021f;
    L_0x0180:
        r0 = r3.locals;
        r21 = r0;
        r0 = r21;
        r0 = r0.current_scope;
        r21 = r0;
        r0 = r26;
        r0 = r0.moduleClass;
        r22 = r0;
        r23 = "$instance";
        r0 = r21;
        r1 = r22;
        r2 = r23;
        r21 = r0.addVariable(r3, r1, r2);
        r0 = r21;
        r1 = r26;
        r1.moduleInstanceVar = r0;
        r0 = r26;
        r0 = r0.moduleClass;
        r21 = r0;
        r0 = r26;
        r0 = r0.mainClass;
        r22 = r0;
        r0 = r21;
        r1 = r22;
        if (r0 == r1) goto L_0x022c;
    L_0x01b4:
        r21 = r26.isStatic();
        if (r21 != 0) goto L_0x022c;
    L_0x01ba:
        r0 = r26;
        r0 = r0.moduleClass;
        r21 = r0;
        r0 = r21;
        r3.emitNew(r0);
        r0 = r26;
        r0 = r0.moduleClass;
        r21 = r0;
        r0 = r21;
        r3.emitDup(r0);
        r0 = r26;
        r0 = r0.moduleClass;
        r21 = r0;
        r0 = r21;
        r0 = r0.constructor;
        r21 = r0;
        r0 = r21;
        r3.emitInvokeSpecial(r0);
        r0 = r26;
        r0 = r0.moduleClass;
        r21 = r0;
        r22 = "$main";
        r0 = r26;
        r0 = r0.mainClass;
        r23 = r0;
        r24 = 0;
        r21 = r21.addField(r22, r23, r24);
        r0 = r21;
        r1 = r26;
        r1.moduleInstanceMainField = r0;
        r0 = r26;
        r0 = r0.moduleClass;
        r21 = r0;
        r0 = r21;
        r3.emitDup(r0);
        r3.emitPushThis();
        r0 = r26;
        r0 = r0.moduleInstanceMainField;
        r21 = r0;
        r0 = r21;
        r3.emitPutField(r0);
    L_0x0214:
        r0 = r26;
        r0 = r0.moduleInstanceVar;
        r21 = r0;
        r0 = r21;
        r3.emitStore(r0);
    L_0x021f:
        r0 = r26;
        r0 = r0.moduleInstanceVar;
        r21 = r0;
        r0 = r21;
        r3.emitLoad(r0);
        goto L_0x008f;
    L_0x022c:
        r0 = r26;
        r0 = r0.moduleInstanceMainField;
        r21 = r0;
        r0 = r21;
        r3.emitGetStatic(r0);
        goto L_0x0214;
    L_0x0238:
        r21 = -1;
        goto L_0x00b5;
    L_0x023c:
        r0 = r26;
        r1 = r20;
        r2 = r19;
        r0.compileConstant(r1, r2);
        goto L_0x0110;
    L_0x0247:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: gnu.expr.ProcInitializer.emitLoadModuleMethod(gnu.expr.LambdaExp, gnu.expr.Compilation):void");
    }

    public void emit(Compilation comp) {
        CodeAttr code = comp.getCode();
        if (!this.field.getStaticFlag()) {
            code.emitPushThis();
        }
        emitLoadModuleMethod(this.proc, comp);
        if (this.field.getStaticFlag()) {
            code.emitPutStatic(this.field);
        } else {
            code.emitPutField(this.field);
        }
    }

    public void reportError(String message, Compilation comp) {
        String saveFile = comp.getFileName();
        int saveLine = comp.getLineNumber();
        int saveColumn = comp.getColumnNumber();
        comp.setLocation(this.proc);
        String name = this.proc.getName();
        StringBuffer sbuf = new StringBuffer(message);
        if (name == null) {
            sbuf.append("unnamed procedure");
        } else {
            sbuf.append("procedure ");
            sbuf.append(name);
        }
        comp.error('e', sbuf.toString());
        comp.setLine(saveFile, saveLine, saveColumn);
    }
}
