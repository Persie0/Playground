package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.C0892f;
import cm.InterfaceC2041a;
import com.google.android.gms.internal.measurement.C2684h3;
import com.google.android.gms.internal.measurement.InterfaceC2597b0;
import com.google.android.gms.internal.measurement.InterfaceC2790p;
import com.google.android.play.core.assetpacks.C3118i;
import dm.C5207g;
import dm.C5212l;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.C6752c;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.C7076b;
import p041c5.C1722t;
import p058d.C4999a;
import p105f0.C5458f;
import p213k4.AbstractC6583c;
import p214k5.C6610l;
import p269n3.C7696a;
import p269n3.C7698c;
import p269n3.C7700e;
import p269n3.C7702g;
import p338qd.C8523a1;
import p338qd.C8579t0;
import p338qd.InterfaceC8585v0;
import p339qe.C8597b;
import p385sf.C9000b;
import p534zf.C10487e;

/* JADX INFO: renamed from: androidx.appcompat.widget.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0322j implements InterfaceC2597b0, InterfaceC8585v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1237a;

    /* JADX INFO: renamed from: b */
    public final Object f1238b;

    /* JADX INFO: renamed from: c */
    public final Object f1239c;

    public C0322j(int i10) {
        this.f1237a = i10;
        if (i10 == 4) {
            this.f1238b = new Object();
            this.f1239c = new LinkedHashMap();
        } else if (i10 != 8) {
            this.f1238b = new C5458f(new Reference[16]);
            this.f1239c = new ReferenceQueue();
        } else {
            this.f1238b = "";
            C10487e c10487eM19445u = C10487e.m19445u();
            this.f1239c = c10487eM19445u;
            c10487eM19445u.m19450D("destination", "");
        }
    }

    public C0322j(EditText editText) {
        this.f1237a = 0;
        this.f1238b = editText;
        this.f1239c = new C7696a(editText);
    }

    public C0322j(C5458f c5458f, InterfaceC2041a interfaceC2041a) {
        this.f1237a = 1;
        this.f1238b = c5458f;
        this.f1239c = interfaceC2041a;
    }

    public /* synthetic */ C0322j(Object obj, int i10, Object obj2) {
        this.f1237a = i10;
        this.f1238b = obj;
        this.f1239c = obj2;
    }

    public C0322j(AbstractC6583c abstractC6583c, AbstractC6583c abstractC6583c2) {
        this.f1237a = 3;
        this.f1238b = abstractC6583c;
        this.f1239c = abstractC6583c2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m1213a(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        if (!C7076b.m14278X2(message, "1555", true)) {
            throw sQLiteConstraintException;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2597b0
    /* JADX INFO: renamed from: b */
    public final C2684h3 mo1214b(InterfaceC2790p interfaceC2790p) {
        C2684h3 c2684h3M7862a = ((C2684h3) this.f1238b).m7862a();
        String str = (String) this.f1239c;
        c2684h3M7862a.m7866e(str, interfaceC2790p);
        c2684h3M7862a.f14229d.put(str, Boolean.TRUE);
        return c2684h3M7862a;
    }

    /* JADX INFO: renamed from: c */
    public final void m1215c() {
        Reference referencePoll;
        do {
            referencePoll = ((ReferenceQueue) this.f1239c).poll();
            if (referencePoll != null) {
                ((C5458f) this.f1238b).m11696m(referencePoll);
            }
        } while (referencePoll != null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1216d(C6610l c6610l) {
        boolean zContainsKey;
        synchronized (this.f1238b) {
            zContainsKey = ((Map) this.f1239c).containsKey(c6610l);
        }
        return zContainsKey;
    }

    /* JADX INFO: renamed from: e */
    public final void m1217e() {
        Object obj = this.f1238b;
        try {
            C8597b c8597b = (C8597b) this.f1239c;
            c8597b.getClass();
            new File(c8597b.f46076b, (String) obj).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) obj), e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final KeyListener m1218f(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((C7696a) this.f1239c).f42205a.getClass();
            if (keyListener instanceof C7700e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            keyListener = new C7700e(keyListener);
        }
        return keyListener;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m1219g(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f1238b).getContext().obtainStyledAttributes(attributeSet, C4999a.f32595i, i10, 0);
        try {
            boolean z10 = true;
            if (typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
            }
            typedArrayObtainStyledAttributes.recycle();
            m1223k(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final InputConnection m1220h(InputConnection inputConnection, EditorInfo editorInfo) {
        C7696a c7696a = (C7696a) this.f1239c;
        if (inputConnection == null) {
            c7696a.getClass();
            return null;
        }
        C7696a.a aVar = c7696a.f42205a;
        aVar.getClass();
        return inputConnection instanceof C7698c ? inputConnection : new C7698c(aVar.f42206a, inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: i */
    public final C1722t m1221i(C6610l c6610l) {
        C1722t c1722t;
        C5207g.m11111f(c6610l, "id");
        synchronized (this.f1238b) {
            try {
                c1722t = (C1722t) ((Map) this.f1239c).remove(c6610l);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1722t;
    }

    /* JADX INFO: renamed from: j */
    public final List m1222j(String str) {
        List listM13453u0;
        C5207g.m11111f(str, "workSpecId");
        synchronized (this.f1238b) {
            try {
                Map map = (Map) this.f1239c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (C5207g.m11106a(((C6610l) entry.getKey()).f37514a, str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((Map) this.f1239c).remove((C6610l) it.next());
                }
                listM13453u0 = C6752c.m13453u0(linkedHashMap.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listM13453u0;
    }

    /* JADX INFO: renamed from: k */
    public final void m1223k(boolean z10) {
        C7702g c7702g = ((C7696a) this.f1239c).f42205a.f42207b;
        if (c7702g.f42227d != z10) {
            if (c7702g.f42226c != null) {
                C0892f c0892fM3519a = C0892f.m3519a();
                C7702g.a aVar = c7702g.f42226c;
                c0892fM3519a.getClass();
                C5212l.m11132C(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0892fM3519a.f5985a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0892fM3519a.f5986b.remove(aVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c7702g.f42227d = z10;
            if (z10) {
                C7702g.m15297a(c7702g.f42224a, C0892f.m3519a().m3521b());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final C1722t m1224l(C6610l c6610l) {
        C1722t c1722t;
        synchronized (this.f1238b) {
            Map map = (Map) this.f1239c;
            Object c1722t2 = map.get(c6610l);
            if (c1722t2 == null) {
                c1722t2 = new C1722t(c6610l);
                map.put(c6610l, c1722t2);
            }
            c1722t = (C1722t) c1722t2;
        }
        return c1722t;
    }

    /* JADX INFO: renamed from: m */
    public final void m1225m(Object obj) {
        try {
            ((AbstractC6583c) this.f1238b).m13171g(obj);
        } catch (SQLiteConstraintException e10) {
            m1213a(e10);
            ((AbstractC6583c) this.f1239c).m13169e(obj);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1226n(List list) {
        C5207g.m11111f(list, "entities");
        for (Object obj : list) {
            try {
                ((AbstractC6583c) this.f1238b).m13171g(obj);
            } catch (SQLiteConstraintException e10) {
                m1213a(e10);
                ((AbstractC6583c) this.f1239c).m13169e(obj);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final long m1227o(Object obj) {
        try {
            return ((AbstractC6583c) this.f1238b).m13172h(obj);
        } catch (SQLiteConstraintException e10) {
            m1213a(e10);
            ((AbstractC6583c) this.f1239c).m13169e(obj);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: p */
    public final ListBuilder m1228p(List list) {
        C5207g.m11111f(list, "entities");
        ListBuilder listBuilder = new ListBuilder();
        for (Object obj : list) {
            try {
                listBuilder.add(Long.valueOf(((AbstractC6583c) this.f1238b).m13172h(obj)));
            } catch (SQLiteConstraintException e10) {
                m1213a(e10);
                ((AbstractC6583c) this.f1239c).m13169e(obj);
                listBuilder.add(-1L);
            }
        }
        C9000b.m17239e(listBuilder);
        return listBuilder;
    }

    @Override // p338qd.InterfaceC8585v0
    public final Object zza() {
        C3118i c3118i = (C3118i) this.f1238b;
        Bundle bundle = (Bundle) this.f1239c;
        c3118i.getClass();
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        HashMap map = c3118i.f15938e;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return Boolean.TRUE;
        }
        C8579t0 c8579t0 = (C8579t0) map.get(numValueOf);
        if (c8579t0.f46010c.f45995d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C8523a1.m16633c(c8579t0.f46010c.f45995d, bundle.getInt(C5212l.m11179t0("status", C3118i.m8987e(bundle)))));
    }
}
