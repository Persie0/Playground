package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p000.m17;
import p000.sg4;
import p000.y21;
import p000.y38;

/* JADX INFO: loaded from: classes.dex */
public abstract class CallableReference implements sg4, Serializable {

    /* JADX INFO: renamed from: g */
    public static final Object f47702g = null;

    /* JADX INFO: renamed from: a */
    public transient sg4 f47703a;

    /* JADX INFO: renamed from: b */
    public final Object f47704b;

    /* JADX INFO: renamed from: c */
    public final Class f47705c;

    /* JADX INFO: renamed from: d */
    public final String f47706d;

    /* JADX INFO: renamed from: e */
    public final String f47707e;

    /* JADX INFO: renamed from: f */
    public final boolean f47708f;

    public static class NoReceiver implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final NoReceiver f47709a = new NoReceiver();

        private Object readResolve() throws ObjectStreamException {
            return f47709a;
        }
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.f47704b = obj;
        this.f47705c = cls;
        this.f47706d = str;
        this.f47707e = str2;
        this.f47708f = z;
    }

    /* JADX INFO: renamed from: d */
    public abstract sg4 mo15405d();

    /* JADX INFO: renamed from: g */
    public final y21 m15406g() {
        Class cls = this.f47705c;
        if (cls == null) {
            return null;
        }
        if (!this.f47708f) {
            return y38.m24933a(cls);
        }
        y38.f69246a.getClass();
        return new m17(cls);
    }
}
