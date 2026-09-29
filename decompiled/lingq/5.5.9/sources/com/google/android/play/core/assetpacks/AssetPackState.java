package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import dm.C5212l;
import p338qd.C8544h1;
import p338qd.C8561n0;
import p338qd.C8594z;
import p338qd.InterfaceC8581u;

/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPackState {
    /* JADX INFO: renamed from: h */
    public static C8594z m8941h(String str, int i10, int i11, long j10, long j11, double d10, int i12, String str2, String str3) {
        return new C8594z(str, i10, i11, j10, j11, (int) Math.rint(100.0d * d10), i12, str2, str3);
    }

    /* JADX INFO: renamed from: i */
    public static C8594z m8942i(Bundle bundle, String str, C8561n0 c8561n0, C8544h1 c8544h1, InterfaceC8581u interfaceC8581u) {
        double dDoubleValue;
        int i10;
        int iMo11189a = interfaceC8581u.mo11189a(bundle.getInt(C5212l.m11179t0("status", str)));
        int i11 = bundle.getInt(C5212l.m11179t0("error_code", str));
        long j10 = bundle.getLong(C5212l.m11179t0("bytes_downloaded", str));
        long j11 = bundle.getLong(C5212l.m11179t0("total_bytes_to_download", str));
        synchronized (c8561n0) {
            Double d10 = (Double) c8561n0.f45928a.get(str);
            dDoubleValue = d10 == null ? 0.0d : d10.doubleValue();
        }
        long j12 = bundle.getLong(C5212l.m11179t0("pack_version", str));
        long j13 = bundle.getLong(C5212l.m11179t0("pack_base_version", str));
        int i12 = 1;
        int i13 = 4;
        if (iMo11189a == 4) {
            if (j13 != 0 && j13 != j12) {
                i12 = 2;
            }
            i10 = i12;
        } else {
            i10 = 1;
            i13 = iMo11189a;
        }
        return m8941h(str, i13, i11, j10, j11, dDoubleValue, i10, bundle.getString(C5212l.m11179t0("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), c8544h1.m16650a(str));
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo8943a();

    /* JADX INFO: renamed from: b */
    public abstract int mo8944b();

    /* JADX INFO: renamed from: c */
    public abstract String mo8945c();

    /* JADX INFO: renamed from: d */
    public abstract int mo8946d();

    /* JADX INFO: renamed from: e */
    public abstract long mo8947e();

    /* JADX INFO: renamed from: f */
    public abstract int mo8948f();

    /* JADX INFO: renamed from: g */
    public abstract int mo8949g();

    /* JADX INFO: renamed from: j */
    public abstract String mo8950j();

    /* JADX INFO: renamed from: k */
    public abstract String mo8951k();
}
