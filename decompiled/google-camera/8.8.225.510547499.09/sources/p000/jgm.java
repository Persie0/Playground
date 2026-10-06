package p000;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class jgm implements jqs {

    /* JADX INFO: renamed from: a */
    protected final DataHolder f33966a;

    /* JADX INFO: renamed from: b */
    protected int f33967b;

    /* JADX INFO: renamed from: c */
    public int f33968c;

    public jgm(DataHolder dataHolder, int i) {
        jib.m13205j(dataHolder);
        this.f33966a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.f7633h) {
            z = true;
        }
        jib.m13201f(z);
        this.f33967b = i;
        this.f33968c = dataHolder.m4660a(i);
    }

    /* JADX INFO: renamed from: a */
    protected final String m13136a(String str) {
        return this.f33966a.m4661b(str, this.f33967b, this.f33968c);
    }

    /* JADX INFO: renamed from: b */
    protected final int m13137b() {
        DataHolder dataHolder = this.f33966a;
        int i = this.f33967b;
        int i2 = this.f33968c;
        dataHolder.m4662c("event_type", i);
        return dataHolder.f7629d[i2].getInt(i, dataHolder.f7628c.getInt("event_type"));
    }

    @Override // p000.jqs
    /* JADX INFO: renamed from: c */
    public final String mo4668c() {
        return m13136a("asset_key");
    }

    @Override // p000.jqs
    /* JADX INFO: renamed from: d */
    public final String mo4669d() {
        return m13136a("asset_id");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jgm) {
            jgm jgmVar = (jgm) obj;
            if (jib.m13209n(Integer.valueOf(jgmVar.f33967b), Integer.valueOf(this.f33967b)) && jib.m13209n(Integer.valueOf(jgmVar.f33968c), Integer.valueOf(this.f33968c)) && jgmVar.f33966a == this.f33966a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f33967b), Integer.valueOf(this.f33968c), this.f33966a});
    }
}
