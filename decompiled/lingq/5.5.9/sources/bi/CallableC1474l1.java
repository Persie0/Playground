package bi;

import android.database.Cursor;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1474l1 implements Callable<UserLanguageStudyStats> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1422e1 f8583b;

    public CallableC1474l1(C1422e1 c1422e1, C6595o c6595o) {
        this.f8583b = c1422e1;
        this.f8582a = c6595o;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final UserLanguageStudyStats call() throws Exception {
        C1422e1 c1422e1 = this.f8583b;
        Cursor cursorM16698S0 = C8573r0.m16698S0(c1422e1.f8402a, this.f8582a);
        try {
            String str = null;
            UserLanguageStudyStats userLanguageStudyStats = str;
            if (cursorM16698S0.moveToFirst()) {
                userLanguageStudyStats = new UserLanguageStudyStats(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.getInt(1), cursorM16698S0.getInt(2), cursorM16698S0.getInt(3), cursorM16698S0.getInt(4), c1422e1.f8410i.m5008s(cursorM16698S0.isNull(5) ? str : cursorM16698S0.getString(5)), cursorM16698S0.getInt(6));
            }
            cursorM16698S0.close();
            return userLanguageStudyStats;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            throw th2;
        }
    }

    public final void finalize() {
        this.f8582a.m13198q();
    }
}
