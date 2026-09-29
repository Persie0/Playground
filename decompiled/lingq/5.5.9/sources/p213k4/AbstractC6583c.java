package p213k4;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import dm.C5207g;
import java.util.Iterator;
import p288o4.InterfaceC7920f;

/* JADX INFO: renamed from: k4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6583c extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6583c(RoomDatabase roomDatabase, int i10) {
        super(roomDatabase);
        if (i10 != 1) {
            C5207g.m11111f(roomDatabase, "database");
        } else {
            C5207g.m11111f(roomDatabase, "database");
            super(roomDatabase);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4989d(InterfaceC7920f interfaceC7920f, Object obj);

    /* JADX INFO: renamed from: e */
    public final void m13169e(Object obj) {
        InterfaceC7920f interfaceC7920fM4574a = m4574a();
        try {
            mo4989d(interfaceC7920fM4574a, obj);
            interfaceC7920fM4574a.mo15736A();
            m4576c(interfaceC7920fM4574a);
        } catch (Throwable th2) {
            m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m13170f(Iterable iterable) {
        C5207g.m11111f(iterable, "entities");
        InterfaceC7920f interfaceC7920fM4574a = m4574a();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo4989d(interfaceC7920fM4574a, it.next());
                interfaceC7920fM4574a.mo15736A();
            }
            m4576c(interfaceC7920fM4574a);
        } catch (Throwable th2) {
            m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m13171g(Object obj) {
        InterfaceC7920f interfaceC7920fM4574a = m4574a();
        try {
            mo4989d(interfaceC7920fM4574a, obj);
            interfaceC7920fM4574a.mo15737u1();
            m4576c(interfaceC7920fM4574a);
        } catch (Throwable th2) {
            m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final long m13172h(Object obj) {
        InterfaceC7920f interfaceC7920fM4574a = m4574a();
        try {
            mo4989d(interfaceC7920fM4574a, obj);
            long jMo15737u1 = interfaceC7920fM4574a.mo15737u1();
            m4576c(interfaceC7920fM4574a);
            return jMo15737u1;
        } catch (Throwable th2) {
            m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
