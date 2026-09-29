package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.material.carousel.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2979a {

    /* JADX INFO: renamed from: a */
    public final float f14962a;

    /* JADX INFO: renamed from: b */
    public final List<b> f14963b;

    /* JADX INFO: renamed from: c */
    public final int f14964c;

    /* JADX INFO: renamed from: d */
    public final int f14965d;

    /* JADX INFO: renamed from: com.google.android.material.carousel.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final float f14966a;

        /* JADX INFO: renamed from: c */
        public b f14968c;

        /* JADX INFO: renamed from: d */
        public b f14969d;

        /* JADX INFO: renamed from: b */
        public final ArrayList f14967b = new ArrayList();

        /* JADX INFO: renamed from: e */
        public int f14970e = -1;

        /* JADX INFO: renamed from: f */
        public int f14971f = -1;

        /* JADX INFO: renamed from: g */
        public float f14972g = 0.0f;

        public a(float f3) {
            this.f14966a = f3;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m8662a(float f3, float f10, float f11, boolean z10) {
            if (f11 <= 0.0f) {
                return;
            }
            b bVar = new b(Float.MIN_VALUE, f3, f10, f11);
            ArrayList arrayList = this.f14967b;
            if (z10) {
                if (this.f14968c == null) {
                    this.f14968c = bVar;
                    this.f14970e = arrayList.size();
                }
                if (this.f14971f != -1 && arrayList.size() - this.f14971f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f11 != this.f14968c.f14976d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f14969d = bVar;
                this.f14971f = arrayList.size();
            } else {
                if (this.f14968c == null && f11 < this.f14972g) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f14969d != null && f11 > this.f14972g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f14972g = f11;
            arrayList.add(bVar);
        }

        /* JADX INFO: renamed from: b */
        public final C2979a m8663b() {
            if (this.f14968c == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f14967b;
                int size = arrayList2.size();
                float f3 = this.f14966a;
                if (i10 >= size) {
                    return new C2979a(f3, arrayList, this.f14970e, this.f14971f);
                }
                b bVar = (b) arrayList2.get(i10);
                arrayList.add(new b((i10 * f3) + (this.f14968c.f14974b - (this.f14970e * f3)), bVar.f14974b, bVar.f14975c, bVar.f14976d));
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final float f14973a;

        /* JADX INFO: renamed from: b */
        public final float f14974b;

        /* JADX INFO: renamed from: c */
        public final float f14975c;

        /* JADX INFO: renamed from: d */
        public final float f14976d;

        public b(float f3, float f10, float f11, float f12) {
            this.f14973a = f3;
            this.f14974b = f10;
            this.f14975c = f11;
            this.f14976d = f12;
        }
    }

    public C2979a(float f3, ArrayList arrayList, int i10, int i11) {
        this.f14962a = f3;
        this.f14963b = Collections.unmodifiableList(arrayList);
        this.f14964c = i10;
        this.f14965d = i11;
    }

    /* JADX INFO: renamed from: a */
    public final b m8658a() {
        return this.f14963b.get(this.f14964c);
    }

    /* JADX INFO: renamed from: b */
    public final b m8659b() {
        return this.f14963b.get(0);
    }

    /* JADX INFO: renamed from: c */
    public final b m8660c() {
        return this.f14963b.get(this.f14965d);
    }

    /* JADX INFO: renamed from: d */
    public final b m8661d() {
        List<b> list = this.f14963b;
        return list.get(list.size() - 1);
    }
}
