package p000;

import java.util.ArrayList;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class m12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final u94[] f50425a;

    /* JADX INFO: renamed from: b */
    public final s94[] f50426b;

    /* JADX INFO: renamed from: c */
    public final int f50427c;

    /* JADX INFO: renamed from: d */
    public final int f50428d;

    public m12(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = arrayList.get(i);
            if (obj instanceof m12) {
                u94[] u94VarArr = ((m12) obj).f50425a;
                if (u94VarArr != null) {
                    for (u94 u94Var : u94VarArr) {
                        arrayList2.add(u94Var);
                    }
                }
            } else {
                arrayList2.add(obj);
            }
            Object obj2 = arrayList.get(i + 1);
            if (obj2 instanceof m12) {
                s94[] s94VarArr = ((m12) obj2).f50426b;
                if (s94VarArr != null) {
                    for (s94 s94Var : s94VarArr) {
                        arrayList3.add(s94Var);
                    }
                }
            } else {
                arrayList3.add(obj2);
            }
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.f50425a = null;
            this.f50427c = 0;
        } else {
            int size2 = arrayList2.size();
            this.f50425a = new u94[size2];
            int iEstimatePrintedLength = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                u94 u94Var2 = (u94) arrayList2.get(i2);
                iEstimatePrintedLength += u94Var2.estimatePrintedLength();
                this.f50425a[i2] = u94Var2;
            }
            this.f50427c = iEstimatePrintedLength;
        }
        if (arrayList3.contains(null) || arrayList3.isEmpty()) {
            this.f50426b = null;
            this.f50428d = 0;
            return;
        }
        int size3 = arrayList3.size();
        this.f50426b = new s94[size3];
        int iEstimateParsedLength = 0;
        for (int i3 = 0; i3 < size3; i3++) {
            s94 s94Var2 = (s94) arrayList3.get(i3);
            iEstimateParsedLength += s94Var2.estimateParsedLength();
            this.f50426b[i3] = s94Var2;
        }
        this.f50428d = iEstimateParsedLength;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f50428d;
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return this.f50427c;
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        s94[] s94VarArr = this.f50426b;
        if (s94VarArr == null) {
            ij6.m13946b();
            return 0;
        }
        int length = s94VarArr.length;
        for (int i2 = 0; i2 < length && i >= 0; i2++) {
            i = s94VarArr[i2].parseInto(b22Var, charSequence, i);
        }
        return i;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        u94[] u94VarArr = this.f50425a;
        if (u94VarArr == null) {
            ij6.m13946b();
            return;
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (u94 u94Var : u94VarArr) {
            u94Var.printTo(appendable, j, s11Var, i, dateTimeZone, locale2);
        }
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        u94[] u94VarArr = this.f50425a;
        if (u94VarArr != null) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (u94 u94Var : u94VarArr) {
                u94Var.printTo(appendable, ir7Var, locale);
            }
            return;
        }
        ij6.m13946b();
    }
}
