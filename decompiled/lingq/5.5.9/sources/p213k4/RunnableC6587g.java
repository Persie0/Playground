package p213k4;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import p229l.C7203b;
import p260m8.C7499b;
import p288o4.C7915a;
import p288o4.InterfaceC7916b;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: k4.g */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6587g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6586f f37450a;

    public RunnableC6587g(C6586f c6586f) {
        this.f37450a = c6586f;
    }

    /* JADX INFO: renamed from: a */
    public final SetBuilder m13184a() throws IOException {
        C6586f c6586f = this.f37450a;
        SetBuilder setBuilder = new SetBuilder();
        Cursor cursorM4566q = c6586f.f37427a.m4566q(new C7915a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        try {
            Cursor cursor = cursorM4566q;
            while (cursor.moveToNext()) {
                setBuilder.add(Integer.valueOf(cursor.getInt(0)));
            }
            C9072e c9072e = C9072e.f47360a;
            C5206f.m11032z0(cursorM4566q, null);
            C7499b.m14940g(setBuilder);
            if (!setBuilder.isEmpty()) {
                if (this.f37450a.f37434h == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                InterfaceC7920f interfaceC7920f = this.f37450a.f37434h;
                if (interfaceC7920f == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                interfaceC7920f.mo15736A();
            }
            return setBuilder;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(cursorM4566q, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Set<Integer> setM13184a;
        ReentrantReadWriteLock.ReadLock lock = this.f37450a.f37427a.f7518i.readLock();
        C5207g.m11110e(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
                try {
                    if (!this.f37450a.m13175b() || !this.f37450a.f37432f.compareAndSet(true, false) || this.f37450a.f37427a.m4562m()) {
                        lock.unlock();
                        this.f37450a.getClass();
                        return;
                    }
                    InterfaceC7916b interfaceC7916bMo4578n0 = this.f37450a.f37427a.m4559j().mo4578n0();
                    interfaceC7916bMo4578n0.mo4595c0();
                    try {
                        setM13184a = m13184a();
                        interfaceC7916bMo4578n0.mo4590Z();
                        interfaceC7916bMo4578n0.mo4601w0();
                        lock.unlock();
                        this.f37450a.getClass();
                        if (!setM13184a.isEmpty()) {
                            C6586f c6586f = this.f37450a;
                            synchronized (c6586f.f37436j) {
                                try {
                                    Iterator<Map.Entry<C6586f.c, C6586f.d>> it = c6586f.f37436j.iterator();
                                    while (true) {
                                        C7203b.e eVar = (C7203b.e) it;
                                        if (eVar.hasNext()) {
                                            ((C6586f.d) ((Map.Entry) eVar.next()).getValue()).m13182a(setM13184a);
                                        } else {
                                            C9072e c9072e = C9072e.f47360a;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        interfaceC7916bMo4578n0.mo4601w0();
                        throw th3;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setM13184a = EmptySet.f38034a;
                }
            } catch (SQLiteException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                setM13184a = EmptySet.f38034a;
            }
        } catch (Throwable th4) {
            lock.unlock();
            this.f37450a.getClass();
            throw th4;
        }
    }
}
