package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class PlaylistEntity {
    public static final C1337g0 Companion = new C1337g0();

    /* JADX INFO: renamed from: a */
    public final String f17422a;

    /* JADX INFO: renamed from: b */
    public final String f17423b;

    /* JADX INFO: renamed from: c */
    public final String f17424c;

    /* JADX INFO: renamed from: d */
    public final int f17425d;

    /* JADX INFO: renamed from: e */
    public final boolean f17426e;

    /* JADX INFO: renamed from: f */
    public final boolean f17427f;

    /* JADX INFO: renamed from: g */
    public final int f17428g;

    public /* synthetic */ PlaylistEntity(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, int i3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, PlaylistEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17422a = str;
        this.f17423b = str2;
        this.f17424c = str3;
        if ((i & 8) == 0) {
            this.f17425d = 0;
        } else {
            this.f17425d = i2;
        }
        if ((i & 16) == 0) {
            this.f17426e = false;
        } else {
            this.f17426e = z;
        }
        if ((i & 32) == 0) {
            this.f17427f = true;
        } else {
            this.f17427f = z2;
        }
        if ((i & 64) == 0) {
            this.f17428g = 0;
        } else {
            this.f17428g = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7791a() {
        return this.f17423b;
    }

    /* JADX INFO: renamed from: b */
    public final String m7792b() {
        return this.f17424c;
    }

    /* JADX INFO: renamed from: c */
    public final String m7793c() {
        return this.f17422a;
    }

    /* JADX INFO: renamed from: d */
    public final int m7794d() {
        return this.f17428g;
    }

    /* JADX INFO: renamed from: e */
    public final int m7795e() {
        return this.f17425d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistEntity)) {
            return false;
        }
        PlaylistEntity playlistEntity = (PlaylistEntity) obj;
        return fa4.m11650l(this.f17422a, playlistEntity.f17422a) && fa4.m11650l(this.f17423b, playlistEntity.f17423b) && fa4.m11650l(this.f17424c, playlistEntity.f17424c) && this.f17425d == playlistEntity.f17425d && this.f17426e == playlistEntity.f17426e && this.f17427f == playlistEntity.f17427f && this.f17428g == playlistEntity.f17428g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7796f() {
        return this.f17426e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7797g() {
        return this.f17427f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17428g) + g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f17425d, ux5.m22980c(ux5.m22980c(this.f17422a.hashCode() * 31, this.f17423b, 31), this.f17424c, 31), 31), 31, this.f17426e), 31, this.f17427f);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("PlaylistEntity(nameWithLanguage=", this.f17422a, ", language=", this.f17423b, ", name=");
        AbstractC3393o1.m17748w(this.f17425d, this.f17424c, ", pk=", ", isDefault=", sbM23000w);
        wq1.m24101A(sbM23000w, this.f17426e, ", isFeatured=", this.f17427f, ", order=");
        return wq1.m24123s(sbM23000w, this.f17428g, ")");
    }

    public PlaylistEntity(int i, int i2, String str, String str2, String str3, boolean z, boolean z2) {
        ux5.m22974A(str, str2, str3);
        this.f17422a = str;
        this.f17423b = str2;
        this.f17424c = str3;
        this.f17425d = i;
        this.f17426e = z;
        this.f17427f = z2;
        this.f17428g = i2;
    }

    public /* synthetic */ PlaylistEntity(String str, int i, String str2, String str3) {
        this(0, i, str, str2, str3, false, true);
    }
}
