package bi;

import android.database.Cursor;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.y */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1563y implements Callable<ChallengeDetail> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f8992b;

    public CallableC1563y(C1493o c1493o, C6595o c6595o) {
        this.f8992b = c1493o;
        this.f8991a = c6595o;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.concurrent.Callable
    public final ChallengeDetail call() throws Exception {
        C1493o c1493o = this.f8992b;
        Cursor cursorM16698S0 = C8573r0.m16698S0(c1493o.f8679a, this.f8991a);
        try {
            ChallengeDetail challengeDetail = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                int i10 = cursorM16698S0.getInt(0);
                String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                String string4 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                String string5 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                String string6 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                String string7 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                int i11 = cursorM16698S0.getInt(7);
                String string8 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                if (!cursorM16698S0.isNull(9)) {
                    string = cursorM16698S0.getString(9);
                }
                challengeDetail = new ChallengeDetail(i10, string2, string3, string5, string6, string7, string4, i11, cursorM16698S0.getInt(10) != 0, string8, cursorM16698S0.getInt(11) != 0, cursorM16698S0.getInt(12), c1493o.f8686h.m4998h(string));
            }
            return challengeDetail;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8991a.m13198q();
    }
}
