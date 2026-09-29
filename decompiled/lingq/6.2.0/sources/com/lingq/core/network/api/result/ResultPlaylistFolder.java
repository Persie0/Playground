package com.lingq.core.network.api.result;

import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultPlaylistFolder {
    public static final C1664h3 Companion = new C1664h3();

    /* JADX INFO: renamed from: a */
    public final int f21460a;

    /* JADX INFO: renamed from: b */
    public final String f21461b;

    /* JADX INFO: renamed from: c */
    public final boolean f21462c;

    /* JADX INFO: renamed from: d */
    public final boolean f21463d;

    public /* synthetic */ ResultPlaylistFolder(int i, int i2, String str, boolean z, boolean z2) {
        if (2 != (i & 2)) {
            n3c.m17204b(i, 2, ResultPlaylistFolder$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f21460a = 0;
        } else {
            this.f21460a = i2;
        }
        this.f21461b = str;
        if ((i & 4) == 0) {
            this.f21462c = false;
        } else {
            this.f21462c = z;
        }
        if ((i & 8) == 0) {
            this.f21463d = true;
        } else {
            this.f21463d = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8382a() {
        return this.f21460a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8383b() {
        return this.f21461b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultPlaylistFolder)) {
            return false;
        }
        ResultPlaylistFolder resultPlaylistFolder = (ResultPlaylistFolder) obj;
        return this.f21460a == resultPlaylistFolder.f21460a && fa4.m11650l(this.f21461b, resultPlaylistFolder.f21461b) && this.f21462c == resultPlaylistFolder.f21462c && this.f21463d == resultPlaylistFolder.f21463d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21463d) + g9a.m12428e(ux5.m22980c(Integer.hashCode(this.f21460a) * 31, this.f21461b, 31), 31, this.f21462c);
    }

    public final String toString() {
        return e65.m10875g(ux5.m22995r(this.f21460a, "ResultPlaylistFolder(pk=", ", title=", this.f21461b, ", isDefault="), this.f21462c, ", isFeatured=", this.f21463d, ")");
    }
}
