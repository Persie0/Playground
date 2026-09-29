package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.AbstractC1139n;
import com.google.crypto.tink.shaded.protobuf.C1137l;
import com.google.crypto.tink.shaded.protobuf.C1138m;
import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class eo7 {

    /* JADX INFO: renamed from: c */
    public static final eo7 f37616c = new eo7();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f37618b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final m58 f37617a = new m58(1);

    /* JADX INFO: renamed from: a */
    public final wm8 m11280a(Class cls) {
        wm8 wm8VarM6568y;
        Class cls2;
        o94.m17872a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f37618b;
        wm8 wm8Var = (wm8) concurrentHashMap.get(cls);
        if (wm8Var != null) {
            return wm8Var;
        }
        m58 m58Var = this.f37617a;
        m58Var.getClass();
        Class cls3 = AbstractC1139n.f13616a;
        if (!AbstractC1134i.class.isAssignableFrom(cls) && (cls2 = AbstractC1139n.f13616a) != null && !cls2.isAssignableFrom(cls)) {
            C3386nv.m17626m("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        dr7 dr7VarMessageInfoFor = ((lp5) m58Var.f50618b).messageInfoFor(cls);
        if ((dr7VarMessageInfoFor.f36114d & 2) == 2) {
            wm8VarM6568y = AbstractC1134i.class.isAssignableFrom(cls) ? C1138m.m6606g(AbstractC1139n.f13619d, vx2.f66042a, dr7VarMessageInfoFor.f36111a) : C1138m.m6606g(AbstractC1139n.f13617b, vx2.m23565a(), dr7VarMessageInfoFor.f36111a);
        } else if (AbstractC1134i.class.isAssignableFrom(cls)) {
            wm8VarM6568y = ((dr7VarMessageInfoFor.f36114d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3) == ProtoSyntax.PROTO2 ? C1137l.m6568y(dr7VarMessageInfoFor, al6.f806b, af5.f584b, AbstractC1139n.f13619d, vx2.f66042a, zp5.f71938b) : C1137l.m6568y(dr7VarMessageInfoFor, al6.f806b, af5.f584b, AbstractC1139n.f13619d, null, zp5.f71938b);
        } else {
            wm8VarM6568y = ((dr7VarMessageInfoFor.f36114d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3) == ProtoSyntax.PROTO2 ? C1137l.m6568y(dr7VarMessageInfoFor, al6.f805a, af5.f583a, AbstractC1139n.f13617b, vx2.m23565a(), zp5.f71937a) : C1137l.m6568y(dr7VarMessageInfoFor, al6.f805a, af5.f583a, AbstractC1139n.f13618c, null, zp5.f71937a);
        }
        wm8 wm8Var2 = (wm8) concurrentHashMap.putIfAbsent(cls, wm8VarM6568y);
        return wm8Var2 != null ? wm8Var2 : wm8VarM6568y;
    }
}
