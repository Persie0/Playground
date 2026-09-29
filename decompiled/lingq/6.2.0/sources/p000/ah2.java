package p000;

import coil.disk.C0860a;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ah2 {

    /* JADX INFO: renamed from: a */
    public final String f637a;

    /* JADX INFO: renamed from: b */
    public final long[] f638b = new long[2];

    /* JADX INFO: renamed from: c */
    public final ArrayList f639c = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public final ArrayList f640d = new ArrayList(2);

    /* JADX INFO: renamed from: e */
    public boolean f641e;

    /* JADX INFO: renamed from: f */
    public boolean f642f;

    /* JADX INFO: renamed from: g */
    public C3552rx f643g;

    /* JADX INFO: renamed from: h */
    public int f644h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0860a f645i;

    public ah2(C0860a c0860a, String str) {
        this.f645i = c0860a;
        this.f637a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f639c.add(this.f645i.f10455a.m10107e(sb.toString()));
            sb.append(".tmp");
            this.f640d.add(this.f645i.f10455a.m10107e(sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final ch2 m396a() {
        if (!this.f641e || this.f643g != null || this.f642f) {
            return null;
        }
        ArrayList arrayList = this.f639c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C0860a c0860a = this.f645i;
            if (i >= size) {
                this.f644h++;
                return new ch2(c0860a, this);
            }
            if (!c0860a.f10454K.m22434q((d57) arrayList.get(i))) {
                try {
                    c0860a.m4966u(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
