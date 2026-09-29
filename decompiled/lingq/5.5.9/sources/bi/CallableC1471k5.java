package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.token.TokenTranslations;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.k5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1471k5 implements Callable<TokenTranslations> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8575a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1478l5 f8576b;

    public CallableC1471k5(C1478l5 c1478l5, C6595o c6595o) {
        this.f8576b = c1478l5;
        this.f8575a = c6595o;
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
    @Override // java.util.concurrent.Callable
    public final TokenTranslations call() throws Exception {
        C1478l5 c1478l5 = this.f8576b;
        RoomDatabase roomDatabase = c1478l5.f8600a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8575a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "termWithLanguageAndTarget");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "translations");
                String str = null;
                TokenTranslations tokenTranslations = str;
                if (cursorM16698S0.moveToFirst()) {
                    tokenTranslations = new TokenTranslations(c1478l5.f8602c.m5005p(cursorM16698S0.isNull(iM16742n1) ? str : cursorM16698S0.getString(iM16742n1)), cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return tokenTranslations;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.m4563n();
            throw th3;
        }
    }

    public final void finalize() {
        this.f8575a.m13198q();
    }
}
