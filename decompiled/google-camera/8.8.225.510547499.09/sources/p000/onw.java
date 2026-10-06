package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class onw implements Serializable, oou {

    /* JADX INFO: renamed from: a */
    public static final Object f46331a = onv.f46330a;

    /* JADX INFO: renamed from: b */
    protected final Object f46332b;

    /* JADX INFO: renamed from: c */
    public final String f46333c;

    /* JADX INFO: renamed from: d */
    public final String f46334d;

    /* JADX INFO: renamed from: e */
    private transient oou f46335e;

    /* JADX INFO: renamed from: f */
    private final Class f46336f;

    /* JADX INFO: renamed from: g */
    private final boolean f46337g;

    protected onw(Object obj, Class cls, String str, String str2, boolean z) {
        this.f46332b = obj;
        this.f46336f = cls;
        this.f46333c = str;
        this.f46334d = str2;
        this.f46337g = z;
    }

    /* JADX INFO: renamed from: b */
    public final oou m18726b() {
        oou oouVar = this.f46335e;
        if (oouVar != null) {
            return oouVar;
        }
        mo18729e();
        this.f46335e = this;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final oow m18727c() {
        return this.f46337g ? new ooe(this.f46336f) : ooj.m18762a(this.f46336f);
    }

    @Override // p000.oou
    /* JADX INFO: renamed from: d */
    public final Object mo18728d() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    protected abstract void mo18729e();
}
