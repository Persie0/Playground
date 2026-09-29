package p000;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f54638a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f54639b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f54640c;

    /* JADX INFO: renamed from: d */
    public int f54641d;

    /* JADX INFO: renamed from: e */
    public int f54642e;

    /* JADX INFO: renamed from: f */
    public int f54643f;

    /* JADX INFO: renamed from: g */
    public int f54644g;

    /* JADX INFO: renamed from: h */
    public int f54645h;

    public oo0(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f54638a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f54639b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f54640c = sb;
        this.f54644g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f54641d = 15;
        this.f54642e = 0;
        this.f54643f = 0;
        this.f54645h = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m18177a(char c) {
        StringBuilder sb = this.f54640c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18178b() {
        StringBuilder sb = this.f54640c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f54638a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                no0 no0Var = (no0) arrayList.get(size);
                int i = no0Var.f53040c;
                if (i != length) {
                    return;
                }
                no0Var.f53040c = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final cs1 m18179c(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f54639b;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) m18180d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.f54642e + this.f54643f;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            if (this.f54644g != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                i5 = (this.f54644g != 2 || i4 <= 0) ? 0 : 2;
            } else {
                i5 = 1;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.f54641d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.f54644g == 1) {
            i6 -= this.f54645h - 1;
        }
        return new cs1(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m18180d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f54640c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f54638a;
            if (i5 >= arrayList.size()) {
                break;
            }
            no0 no0Var = (no0) arrayList.get(i5);
            boolean z2 = no0Var.f53039b;
            int i7 = no0Var.f53038a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = po0.f56555B[i7];
                }
                z = z3;
            }
            int i8 = no0Var.f53040c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((no0) arrayList.get(i5)).f53040c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18181e() {
        return this.f54638a.isEmpty() && this.f54639b.isEmpty() && this.f54640c.length() == 0;
    }
}
