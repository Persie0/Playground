package androidx.room;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C6740a;
import p288o4.InterfaceC7920f;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f7553a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f7554b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9070c f7555c;

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        C5207g.m11111f(roomDatabase, "database");
        this.f7553a = roomDatabase;
        this.f7554b = new AtomicBoolean(false);
        this.f7555c = C6740a.m13372a(new InterfaceC2041a<InterfaceC7920f>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC7920f mo807E() {
                SharedSQLiteStatement sharedSQLiteStatement = this.f7556b;
                return sharedSQLiteStatement.f7553a.m4555f(sharedSQLiteStatement.mo4575b());
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC7920f m4574a() {
        RoomDatabase roomDatabase = this.f7553a;
        roomDatabase.m4550a();
        return this.f7554b.compareAndSet(false, true) ? (InterfaceC7920f) this.f7555c.getValue() : roomDatabase.m4555f(mo4575b());
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo4575b();

    /* JADX INFO: renamed from: c */
    public final void m4576c(InterfaceC7920f interfaceC7920f) {
        C5207g.m11111f(interfaceC7920f, "statement");
        if (interfaceC7920f == ((InterfaceC7920f) this.f7555c.getValue())) {
            this.f7554b.set(false);
        }
    }
}
