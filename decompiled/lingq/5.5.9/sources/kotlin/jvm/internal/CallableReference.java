package kotlin.jvm.internal;

import dm.C5209i;
import java.io.ObjectStreamException;
import java.io.Serializable;
import km.InterfaceC6718a;
import km.InterfaceC6721d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CallableReference implements InterfaceC6718a, Serializable {

    /* JADX INFO: renamed from: g */
    public static final Object f38110g = NoReceiver.f38117a;

    /* JADX INFO: renamed from: a */
    public transient InterfaceC6718a f38111a;

    /* JADX INFO: renamed from: b */
    public final Object f38112b;

    /* JADX INFO: renamed from: c */
    public final Class f38113c;

    /* JADX INFO: renamed from: d */
    public final String f38114d;

    /* JADX INFO: renamed from: e */
    public final String f38115e;

    /* JADX INFO: renamed from: f */
    public final boolean f38116f;

    public static class NoReceiver implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final NoReceiver f38117a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f38117a;
        }
    }

    public CallableReference() {
        this(f38110g, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f38112b = obj;
        this.f38113c = cls;
        this.f38114d = str;
        this.f38115e = str2;
        this.f38116f = z10;
    }

    @Override // km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public String mo13336a() {
        return this.f38114d;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC6718a mo13478c();

    /* JADX INFO: renamed from: d */
    public InterfaceC6721d mo13479d() {
        Class cls = this.f38113c;
        if (cls == null) {
            return null;
        }
        return this.f38116f ? C5209i.f33277a.mo11123c(cls, "") : C5209i.m11118a(cls);
    }

    /* JADX INFO: renamed from: e */
    public String mo13480e() {
        return this.f38115e;
    }
}
