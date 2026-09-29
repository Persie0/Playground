package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class zg2 {

    /* JADX INFO: renamed from: a */
    public final String f71521a;

    /* JADX INFO: renamed from: b */
    public final long[] f71522b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f71523c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f71524d;

    /* JADX INFO: renamed from: e */
    public boolean f71525e;

    /* JADX INFO: renamed from: f */
    public boolean f71526f;

    /* JADX INFO: renamed from: g */
    public C3552rx f71527g;

    /* JADX INFO: renamed from: h */
    public int f71528h;

    /* JADX INFO: renamed from: i */
    public long f71529i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ gh2 f71530j;

    public zg2(gh2 gh2Var, String str) {
        str.getClass();
        this.f71530j = gh2Var;
        this.f71521a = str;
        gh2Var.getClass();
        this.f71522b = new long[2];
        this.f71523c = new ArrayList();
        this.f71524d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f71523c.add(this.f71530j.f40806a.m10107e(sb.toString()));
            sb.append(".tmp");
            this.f71524d.add(this.f71530j.f40806a.m10107e(sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final bh2 m25600a() {
        TimeZone timeZone = kcb.f47051a;
        if (!this.f71525e) {
            return null;
        }
        gh2 gh2Var = this.f71530j;
        if (!gh2Var.f40817l && (this.f71527g != null || this.f71526f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f71522b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                yd9 yd9VarMo261N = gh2Var.f40807b.mo261N((d57) this.f71523c.get(i));
                if (!gh2Var.f40817l) {
                    this.f71528h++;
                    yd9VarMo261N = new yg2(yd9VarMo261N, gh2Var, this);
                }
                arrayList.add(yd9VarMo261N);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    icb.m13766b((yd9) it.next());
                }
                try {
                    gh2Var.m12654z(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new bh2(this.f71530j, this.f71521a, this.f71529i, arrayList, jArr);
    }
}
