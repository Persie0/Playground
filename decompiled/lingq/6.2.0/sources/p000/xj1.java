package p000;

import androidx.work.NetworkType;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class xj1 {

    /* JADX INFO: renamed from: a */
    public gk6 f68280a = new gk6(null);

    /* JADX INFO: renamed from: b */
    public NetworkType f68281b = NetworkType.NOT_REQUIRED;

    /* JADX INFO: renamed from: c */
    public final long f68282c = -1;

    /* JADX INFO: renamed from: d */
    public final long f68283d = -1;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f68284e = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final ak1 m24557a() {
        return new ak1(this.f68280a, this.f68281b, false, false, false, false, this.f68282c, this.f68283d, u91.m22627s1(this.f68284e));
    }

    /* JADX INFO: renamed from: b */
    public final void m24558b(NetworkType networkType) {
        networkType.getClass();
        this.f68281b = networkType;
        this.f68280a = new gk6(null);
    }
}
