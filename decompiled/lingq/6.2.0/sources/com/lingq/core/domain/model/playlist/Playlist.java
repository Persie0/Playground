package com.lingq.core.domain.model.playlist;

import p000.AbstractC3393o1;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Playlist {
    public static final C1484a Companion = new C1484a();

    /* JADX INFO: renamed from: a */
    public final String f19553a;

    /* JADX INFO: renamed from: b */
    public final String f19554b;

    /* JADX INFO: renamed from: c */
    public final String f19555c;

    /* JADX INFO: renamed from: d */
    public final int f19556d;

    /* JADX INFO: renamed from: e */
    public final boolean f19557e;

    /* JADX INFO: renamed from: f */
    public final boolean f19558f;

    public /* synthetic */ Playlist(int i, int i2, String str, String str2, String str3, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.f19553a = "";
        } else {
            this.f19553a = str;
        }
        if ((i & 2) == 0) {
            this.f19554b = "";
        } else {
            this.f19554b = str2;
        }
        if ((i & 4) == 0) {
            this.f19555c = "";
        } else {
            this.f19555c = str3;
        }
        if ((i & 8) == 0) {
            this.f19556d = 0;
        } else {
            this.f19556d = i2;
        }
        if ((i & 16) == 0) {
            this.f19557e = false;
        } else {
            this.f19557e = z;
        }
        if ((i & 32) == 0) {
            this.f19558f = true;
        } else {
            this.f19558f = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8116a() {
        return this.f19555c;
    }

    /* JADX INFO: renamed from: b */
    public final String m8117b() {
        return this.f19553a;
    }

    /* JADX INFO: renamed from: c */
    public final int m8118c() {
        return this.f19556d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) obj;
        return fa4.m11650l(this.f19553a, playlist.f19553a) && fa4.m11650l(this.f19554b, playlist.f19554b) && fa4.m11650l(this.f19555c, playlist.f19555c) && this.f19556d == playlist.f19556d && this.f19557e == playlist.f19557e && this.f19558f == playlist.f19558f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19558f) + g9a.m12428e(wq1.m24106b(this.f19556d, ux5.m22980c(ux5.m22980c(this.f19553a.hashCode() * 31, this.f19554b, 31), this.f19555c, 31), 31), 31, this.f19557e);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("Playlist(nameWithLanguage=", this.f19553a, ", language=", this.f19554b, ", name=");
        AbstractC3393o1.m17748w(this.f19556d, this.f19555c, ", pk=", ", isDefault=", sbM23000w);
        return e65.m10875g(sbM23000w, this.f19557e, ", isFeatured=", this.f19558f, ")");
    }

    public Playlist(int i, String str, String str2, String str3, boolean z, boolean z2) {
        ux5.m22974A(str, str2, str3);
        this.f19553a = str;
        this.f19554b = str2;
        this.f19555c = str3;
        this.f19556d = i;
        this.f19557e = z;
        this.f19558f = z2;
    }

    public /* synthetic */ Playlist(String str, int i, String str2) {
        this(i, str, "en", str2, false, true);
    }
}
