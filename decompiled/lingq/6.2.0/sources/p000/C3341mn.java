package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: mn */
/* JADX INFO: loaded from: classes.dex */
public final class C3341mn implements Appendable {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f51543a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f51544b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f51545c;

    public C3341mn() {
        this.f51543a = new StringBuilder(16);
        this.f51544b = new ArrayList();
        this.f51545c = new ArrayList();
        new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m16926a(de5 de5Var, int i, int i2) {
        this.f51545c.add(new C3304ln(de5Var, i, i2, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof C3419on;
        StringBuilder sb = this.f51543a;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        C3419on c3419on = (C3419on) charSequence;
        int length = sb.length();
        sb.append((CharSequence) c3419on.f54604b, i, i2);
        List listM19403a = AbstractC3466pn.m19403a(c3419on, i, i2, null);
        if (listM19403a != null) {
            int size = listM19403a.size();
            for (int i3 = 0; i3 < size; i3++) {
                C3378nn c3378nn = (C3378nn) listM19403a.get(i3);
                this.f51545c.add(new C3304ln(c3378nn.f52979a, c3378nn.f52980b + length, c3378nn.f52981c + length, c3378nn.f52982d));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m16927b(he9 he9Var, int i, int i2) {
        this.f51545c.add(new C3304ln(he9Var, i, i2, 8));
    }

    /* JADX INFO: renamed from: c */
    public final void m16928c(C3419on c3419on) {
        StringBuilder sb = this.f51543a;
        int length = sb.length();
        sb.append(c3419on.f54604b);
        List list = c3419on.f54603a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3378nn c3378nn = (C3378nn) list.get(i);
                this.f51545c.add(new C3304ln(c3378nn.f52979a, c3378nn.f52980b + length, c3378nn.f52981c + length, c3378nn.f52982d));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16929d(String str) {
        this.f51543a.append(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m16930e() {
        ArrayList arrayList = this.f51544b;
        if (arrayList.isEmpty()) {
            j54.m14290c("Nothing to pop.");
        }
        ((C3304ln) arrayList.remove(arrayList.size() - 1)).f49851c = this.f51543a.length();
    }

    /* JADX INFO: renamed from: f */
    public final void m16931f(int i) {
        ArrayList arrayList = this.f51544b;
        if (i >= arrayList.size()) {
            j54.m14290c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            m16930e();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m16932g(he9 he9Var) {
        C3304ln c3304ln = new C3304ln(he9Var, this.f51543a.length(), 0, 12);
        ArrayList arrayList = this.f51544b;
        arrayList.add(c3304ln);
        this.f51545c.add(c3304ln);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: h */
    public final C3419on m16933h() {
        StringBuilder sb = this.f51543a;
        String string = sb.toString();
        ArrayList arrayList = this.f51545c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C3304ln) arrayList.get(i)).m16392a(sb.length()));
        }
        return new C3419on(string, arrayList2);
    }

    public C3341mn(C3419on c3419on) {
        this();
        m16928c(c3419on);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C3419on) {
            m16928c((C3419on) charSequence);
            return this;
        }
        this.f51543a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f51543a.append(c);
        return this;
    }
}
