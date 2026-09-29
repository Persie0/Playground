package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class e74 implements f74, j02, okd {

    /* JADX INFO: renamed from: a */
    public long f36796a;

    /* JADX INFO: renamed from: b */
    public final Object f36797b;

    /* JADX INFO: renamed from: c */
    public Comparable f36798c;

    /* JADX INFO: renamed from: d */
    public Object f36799d;

    public e74(j02 j02Var) {
        j02Var.getClass();
        this.f36797b = j02Var;
        this.f36798c = Uri.EMPTY;
        this.f36799d = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: j */
    public static e74 m10904j(eg4 eg4Var) {
        dg4 dg4Var = (dg4) eg4Var;
        return new e74(dg4Var.m10343m("install_time", 0L).longValue(), dg4Var.m10344n("install_app_id", ""), dg4Var.m10344n("install_url", ""), dg4Var.m10344n("install_original_url", null));
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: b */
    public long mo10000b(k02 k02Var) {
        j02 j02Var = (j02) this.f36797b;
        this.f36798c = k02Var.f46462a;
        this.f36799d = Collections.EMPTY_MAP;
        try {
            return j02Var.mo10000b(k02Var);
        } finally {
            Uri uri = j02Var.getUri();
            if (uri != null) {
                this.f36798c = uri;
            }
            this.f36799d = j02Var.mo10001h();
        }
    }

    @Override // p000.j02
    public void close() {
        ((j02) this.f36797b).close();
    }

    @Override // p000.j02
    public Uri getUri() {
        return ((j02) this.f36797b).getUri();
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: h */
    public Map mo10001h() {
        return ((j02) this.f36797b).mo10001h();
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: l */
    public void mo10002l(u52 u52Var) {
        u52Var.getClass();
        ((j02) this.f36797b).mo10002l(u52Var);
    }

    /* JADX INFO: renamed from: m */
    public dg4 m10905m() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10331B("install_app_id", (String) this.f36797b);
        dg4VarM10328c.m10331B("install_url", (String) this.f36798c);
        dg4VarM10328c.m10330A("install_time", this.f36796a);
        String str = (String) this.f36799d;
        if (str != null) {
            dg4VarM10328c.m10331B("install_original_url", str);
        }
        return dg4VarM10328c;
    }

    @Override // p000.h02
    public int read(byte[] bArr, int i, int i2) {
        int i3 = ((j02) this.f36797b).read(bArr, i, i2);
        if (i3 != -1) {
            this.f36796a += (long) i3;
        }
        return i3;
    }

    @Override // p000.okd
    public C3299li zza() {
        int allocationByteCount;
        zzob zzobVar;
        kx9 kx9Var = (kx9) this.f36797b;
        long j = this.f36796a;
        zzou zzouVar = (zzou) this.f36798c;
        z54 z54Var = (z54) this.f36799d;
        boolean z = false;
        mq7 mq7Var = new mq7(20, z);
        ca1 ca1Var = new ca1();
        ca1Var.f9781a = Long.valueOf(j & Long.MAX_VALUE);
        ca1Var.f9782b = zzouVar;
        ca1Var.f9783c = Boolean.valueOf(kx9.f48559i);
        Boolean bool = Boolean.TRUE;
        ca1Var.f9784d = bool;
        ca1Var.f9785e = bool;
        mq7Var.f51733b = new i7d(ca1Var);
        int i = z54Var.f70941d;
        int i2 = 17;
        if (i == -1) {
            Bitmap bitmap = z54Var.f70938a;
            lda.m16130p(bitmap);
            allocationByteCount = bitmap.getAllocationByteCount();
        } else {
            if (i == 17 || i == 842094169) {
                lda.m16130p(null);
                throw null;
            }
            if (i == 35) {
                lda.m16130p(null);
                throw null;
            }
            allocationByteCount = 0;
        }
        cdb cdbVar = new cdb(i2, z);
        if (i == -1) {
            zzobVar = zzob.BITMAP;
        } else if (i == 35) {
            zzobVar = zzob.YUV_420_888;
        } else if (i == 842094169) {
            zzobVar = zzob.YV12;
        } else if (i != 16) {
            zzobVar = i != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21;
        } else {
            zzobVar = zzob.NV16;
        }
        cdbVar.f9945b = zzobVar;
        cdbVar.f9946c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        mq7Var.f51734c = new v6d(cdbVar);
        vf9 vf9Var = new vf9();
        vf9Var.f65323a = umb.m22832a(kx9Var.f48566g.mo14183d());
        mq7Var.f51735d = new vgd(vf9Var);
        mgd mgdVar = new mgd(mq7Var);
        a34 a34Var = new a34();
        a34Var.f175c = kx9Var.f48566g.mo14186g() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        a34Var.f176d = mgdVar;
        return new C3299li(a34Var, 0);
    }

    public e74(long j, String str, String str2, String str3) {
        this.f36797b = str;
        this.f36798c = str2;
        this.f36796a = j;
        this.f36799d = str3;
    }

    public /* synthetic */ e74(kx9 kx9Var, long j, zzou zzouVar, z54 z54Var) {
        this.f36797b = kx9Var;
        this.f36796a = j;
        this.f36798c = zzouVar;
        this.f36799d = z54Var;
    }
}
