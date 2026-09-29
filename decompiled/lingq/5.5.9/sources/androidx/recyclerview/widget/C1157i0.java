package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1157i0 {

    /* JADX INFO: renamed from: a */
    public final b f7301a;

    /* JADX INFO: renamed from: b */
    public final a f7302b = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f7303a = 0;

        /* JADX INFO: renamed from: b */
        public int f7304b;

        /* JADX INFO: renamed from: c */
        public int f7305c;

        /* JADX INFO: renamed from: d */
        public int f7306d;

        /* JADX INFO: renamed from: e */
        public int f7307e;

        /* JADX INFO: renamed from: a */
        public final boolean m4490a() {
            int i10;
            int i11;
            int i12;
            int i13 = this.f7303a;
            int i14 = 2;
            if ((i13 & 7) != 0) {
                int i15 = this.f7306d;
                int i16 = this.f7304b;
                if (i15 > i16) {
                    i12 = 1;
                } else {
                    i12 = i15 == i16 ? 2 : 4;
                }
                if (((i12 << 0) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 112) != 0) {
                int i17 = this.f7306d;
                int i18 = this.f7305c;
                if (i17 > i18) {
                    i11 = 1;
                } else {
                    i11 = i17 == i18 ? 2 : 4;
                }
                if (((i11 << 4) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 1792) != 0) {
                int i19 = this.f7307e;
                int i20 = this.f7304b;
                if (i19 > i20) {
                    i10 = 1;
                } else {
                    i10 = i19 == i20 ? 2 : 4;
                }
                if (((i10 << 8) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 28672) != 0) {
                int i21 = this.f7307e;
                int i22 = this.f7305c;
                if (i21 > i22) {
                    i14 = 1;
                } else if (i21 != i22) {
                    i14 = 4;
                }
                if ((i13 & (i14 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo4328a(View view);

        /* JADX INFO: renamed from: b */
        int mo4329b();

        /* JADX INFO: renamed from: c */
        int mo4330c();

        /* JADX INFO: renamed from: d */
        View mo4331d(int i10);

        /* JADX INFO: renamed from: e */
        int mo4332e(View view);
    }

    public C1157i0(b bVar) {
        this.f7301a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public final View m4488a(int i10, int i11, int i12, int i13) {
        b bVar = this.f7301a;
        int iMo4329b = bVar.mo4329b();
        int iMo4330c = bVar.mo4330c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewMo4331d = bVar.mo4331d(i10);
            int iMo4328a = bVar.mo4328a(viewMo4331d);
            int iMo4332e = bVar.mo4332e(viewMo4331d);
            a aVar = this.f7302b;
            aVar.f7304b = iMo4329b;
            aVar.f7305c = iMo4330c;
            aVar.f7306d = iMo4328a;
            aVar.f7307e = iMo4332e;
            if (i12 != 0) {
                aVar.f7303a = i12 | 0;
                if (aVar.m4490a()) {
                    return viewMo4331d;
                }
            }
            if (i13 != 0) {
                aVar.f7303a = i13 | 0;
                if (aVar.m4490a()) {
                    view = viewMo4331d;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4489b(View view) {
        b bVar = this.f7301a;
        int iMo4329b = bVar.mo4329b();
        int iMo4330c = bVar.mo4330c();
        int iMo4328a = bVar.mo4328a(view);
        int iMo4332e = bVar.mo4332e(view);
        a aVar = this.f7302b;
        aVar.f7304b = iMo4329b;
        aVar.f7305c = iMo4330c;
        aVar.f7306d = iMo4328a;
        aVar.f7307e = iMo4332e;
        aVar.f7303a = 24579 | 0;
        return aVar.m4490a();
    }
}
