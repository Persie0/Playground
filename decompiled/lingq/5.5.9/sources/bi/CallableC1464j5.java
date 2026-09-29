package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import li.C7376c;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.j5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1464j5 implements Callable<C7376c> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1478l5 f8564b;

    public CallableC1464j5(C1478l5 c1478l5, C6595o c6595o) {
        this.f8564b = c1478l5;
        this.f8563a = c6595o;
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
    public final C7376c call() throws Exception {
        C1478l5 c1478l5 = this.f8564b;
        RoomDatabase roomDatabase = c1478l5.f8600a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8563a);
            try {
                String str = null;
                C7376c c7376c = str;
                if (cursorM16698S0.moveToFirst()) {
                    c7376c = new C7376c(c1478l5.f8602c.m5007r(cursorM16698S0.isNull(0) ? str : cursorM16698S0.getString(0)));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return c7376c;
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
        this.f8563a.m13198q();
    }
}
