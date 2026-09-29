package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1399b2 implements Callable<LessonStudyTranslationSentence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8329b;

    public CallableC1399b2(C1502p1 c1502p1, C6595o c6595o) {
        this.f8329b = c1502p1;
        this.f8328a = c6595o;
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
    public final LessonStudyTranslationSentence call() throws Exception {
        C1502p1 c1502p1 = this.f8329b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8328a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "index");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "lessonId");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "audio");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "audioEnd");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "text");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "translations");
                LessonStudyTranslationSentence lessonStudyTranslationSentence = null;
                String string = null;
                if (cursorM16698S0.moveToFirst()) {
                    int i10 = cursorM16698S0.getInt(iM16742n0);
                    int i11 = cursorM16698S0.getInt(iM16742n1);
                    Double dValueOf = cursorM16698S0.isNull(iM16742n2) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n2));
                    Double dValueOf2 = cursorM16698S0.isNull(iM16742n3) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n3));
                    String string2 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                    if (!cursorM16698S0.isNull(iM16742n5)) {
                        string = cursorM16698S0.getString(iM16742n5);
                    }
                    lessonStudyTranslationSentence = new LessonStudyTranslationSentence(i10, i11, dValueOf, dValueOf2, string2, c1502p1.f8727c.m5004o(string));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return lessonStudyTranslationSentence;
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
        this.f8328a.m13198q();
    }
}
