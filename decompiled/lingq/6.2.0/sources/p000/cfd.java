package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cfd {
    /* JADX INFO: renamed from: a */
    public static final int m4626a(StaticLayout staticLayout, int i) {
        if ((i <= 0 || staticLayout.getLineForOffset(i) != staticLayout.getLineForOffset(i - 1)) && i > 0) {
            return staticLayout.getLineForOffset(i - 1);
        }
        return staticLayout.getLineForOffset(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX INFO: renamed from: b */
    public static final List m4627b(StaticLayout staticLayout, int i, int i2, fb2 fb2Var, int i3, boolean z) {
        int length;
        int iM15945h;
        int iM15945h2;
        int i4;
        if (i >= i2 || iM15945h == (iM15945h2 = l70.m15945h(i2, (iM15945h = l70.m15945h(i, 0, (length = staticLayout.getText().length()))), length))) {
            return EmptyList.f47638a;
        }
        float fMo903F0 = fb2Var.mo903F0(d32.m10018P(i3));
        ArrayList arrayList = new ArrayList();
        int lineForOffset = staticLayout.getLineForOffset(iM15945h);
        int iM4626a = m4626a(staticLayout, iM15945h2);
        if (z) {
            i4 = iM4626a;
        } else {
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(iM15945h2);
            if (primaryHorizontal == staticLayout.getLineLeft(lineForOffset) || primaryHorizontal == 0.0f) {
                i4 = lineForOffset;
            } else {
                i4 = iM4626a;
            }
        }
        if (lineForOffset <= i4) {
            int i5 = lineForOffset;
            while (true) {
                int lineStart = staticLayout.getLineStart(i5);
                int lineEnd = staticLayout.getLineEnd(i5);
                int iMax = Math.max(iM15945h, lineStart);
                int iMin = Math.min(iM15945h2, lineEnd);
                StaticLayout staticLayout2 = staticLayout;
                boolean z2 = z;
                if (iMax < iMin) {
                    Pair pairM4628c = m4628c(staticLayout2, i5, lineForOffset, i4, iMax, iMin, lineStart, z2);
                    float fFloatValue = ((Number) pairM4628c.f47623a).floatValue();
                    float fFloatValue2 = ((Number) pairM4628c.f47624b).floatValue();
                    float fMin = Math.min(fFloatValue, fFloatValue2);
                    float fMax = Math.max(fFloatValue, fFloatValue2);
                    if (fMin < fMax) {
                        float lineBaseline = staticLayout2.getLineBaseline(i5);
                        float f = lineBaseline - (0.95f * fMo903F0);
                        float f2 = lineBaseline + (0.35f * fMo903F0);
                        if (i5 > lineForOffset) {
                            float f3 = 0.08f * fMo903F0;
                            f += f3;
                            f2 += f3;
                        }
                        if (f < f2) {
                            arrayList.add(new e28(fMin, f, fMax, f2));
                        }
                    }
                }
                if (i5 == i4) {
                    break;
                }
                i5++;
                staticLayout = staticLayout2;
                z = z2;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r2 r3
      0x001b: PHI (r2v6 float) = (r2v3 float), (r2v5 float), (r2v14 float) binds: [B:33:0x007b, B:23:0x0058, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001b: PHI (r3v3 float) = (r3v1 float), (r3v2 float), (r3v5 float) binds: [B:33:0x007b, B:23:0x0058, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    public static final Pair m4628c(StaticLayout staticLayout, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        float lineLeft;
        float lineRight;
        float primaryHorizontal;
        float lineRight2;
        if (z) {
            lineRight = staticLayout.getLineRight(i);
            if (i2 == i3) {
                lineLeft = staticLayout.getPrimaryHorizontal(i4);
                primaryHorizontal = staticLayout.getPrimaryHorizontal(i5);
                if (primaryHorizontal >= lineRight) {
                    lineRight2 = staticLayout.getLineLeft(i);
                    lineRight = lineRight2;
                } else {
                    lineRight = primaryHorizontal;
                }
            } else if (i == i2) {
                lineLeft = staticLayout.getLineLeft(i);
                lineRight = staticLayout.getPrimaryHorizontal(i4);
            } else if (i == i3) {
                lineLeft = staticLayout.getPrimaryHorizontal(i5);
                if (lineLeft >= lineRight) {
                    lineLeft = staticLayout.getLineLeft(i);
                }
            } else {
                lineLeft = staticLayout.getLineLeft(i);
                lineRight = staticLayout.getLineRight(i);
            }
        } else if (i == i2) {
            lineLeft = staticLayout.getPrimaryHorizontal(i4);
            primaryHorizontal = staticLayout.getPrimaryHorizontal(i5);
            if (primaryHorizontal == staticLayout.getLineLeft(i) || primaryHorizontal == 0.0f) {
                lineRight2 = staticLayout.getLineRight(i);
                lineRight = lineRight2;
            } else {
                lineRight = primaryHorizontal;
            }
        } else if (i == i3) {
            lineLeft = i4 == i6 ? staticLayout.getLineLeft(i) : staticLayout.getPrimaryHorizontal(i4);
            primaryHorizontal = staticLayout.getPrimaryHorizontal(i5);
            if (primaryHorizontal == staticLayout.getLineLeft(i) || primaryHorizontal == 0.0f) {
                lineRight2 = staticLayout.getLineRight(i);
                lineRight = lineRight2;
            } else {
                lineRight = primaryHorizontal;
            }
        } else {
            lineLeft = staticLayout.getLineLeft(i);
            lineRight = staticLayout.getLineRight(i);
        }
        return new Pair(Float.valueOf(lineLeft), Float.valueOf(lineRight));
    }

    /* JADX INFO: renamed from: d */
    public static final StaticLayout m4629d(float f, int i, TextPaint textPaint, CharSequence charSequence, boolean z) {
        charSequence.getClass();
        StaticLayout.Builder breakStrategy = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setLineSpacing(0.0f, f).setIncludePad(true).setAlignment(Layout.Alignment.ALIGN_NORMAL).setHyphenationFrequency(0).setBreakStrategy(0);
        if (z) {
            breakStrategy.setTextDirection(TextDirectionHeuristics.ANYRTL_LTR);
        }
        StaticLayout staticLayoutBuild = breakStrategy.build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }

    /* JADX INFO: renamed from: e */
    public static final int m4630e(StaticLayout staticLayout, long j) {
        return staticLayout.getOffsetForHorizontal(staticLayout.getLineForVertical((int) Float.intBitsToFloat((int) (4294967295L & j))), Float.intBitsToFloat((int) (j >> 32)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX INFO: renamed from: f */
    public static final List m4631f(StaticLayout staticLayout, int i, int i2, fb2 fb2Var, int i3, boolean z) {
        int length;
        int iM15945h;
        int iM15945h2;
        int i4;
        staticLayout.getClass();
        if (i >= i2 || iM15945h == (iM15945h2 = l70.m15945h(i2, (iM15945h = l70.m15945h(i, 0, (length = staticLayout.getText().length()))), length))) {
            return EmptyList.f47638a;
        }
        float fMo903F0 = fb2Var.mo903F0(d32.m10018P(i3));
        ArrayList arrayList = new ArrayList();
        int lineForOffset = staticLayout.getLineForOffset(iM15945h);
        int iM4626a = m4626a(staticLayout, iM15945h2);
        if (z) {
            i4 = iM4626a;
        } else {
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(iM15945h2);
            if (primaryHorizontal == staticLayout.getLineLeft(lineForOffset) || primaryHorizontal == 0.0f) {
                i4 = lineForOffset;
            } else {
                i4 = iM4626a;
            }
        }
        if (lineForOffset <= i4) {
            int i5 = lineForOffset;
            while (true) {
                int lineStart = staticLayout.getLineStart(i5);
                int lineEnd = staticLayout.getLineEnd(i5);
                int iMax = Math.max(iM15945h, lineStart);
                int iMin = Math.min(iM15945h2, lineEnd);
                StaticLayout staticLayout2 = staticLayout;
                boolean z2 = z;
                if (iMax < iMin) {
                    Pair pairM4628c = m4628c(staticLayout2, i5, lineForOffset, i4, iMax, iMin, lineStart, z2);
                    float fFloatValue = ((Number) pairM4628c.f47623a).floatValue();
                    float fFloatValue2 = ((Number) pairM4628c.f47624b).floatValue();
                    float fMin = Math.min(fFloatValue, fFloatValue2);
                    float fMax = Math.max(fFloatValue, fFloatValue2);
                    if (fMin < fMax) {
                        float lineBaseline = staticLayout2.getLineBaseline(i5);
                        arrayList.add(new e28(fMin, lineBaseline - (0.95f * fMo903F0), fMax, lineBaseline + (0.35f * fMo903F0)));
                    }
                }
                if (i5 == i4) {
                    break;
                }
                i5++;
                staticLayout = staticLayout2;
                z = z2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final e28 m4632g(List list, aq4 aq4Var) {
        List list2 = list;
        if (list2 == null || list2.isEmpty() || aq4Var == null) {
            return e28.f36619e;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            C3386nv.m17636w("Empty collection can't be reduced.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            e28 e28Var = (e28) it.next();
            e28 e28Var2 = (e28) next;
            next = new e28(Math.min(e28Var2.f36620a, e28Var.f36620a), Math.min(e28Var2.f36621b, e28Var.f36621b), Math.max(e28Var2.f36622c, e28Var.f36622c), Math.max(e28Var2.f36623d, e28Var.f36623d));
        }
        e28 e28Var3 = (e28) next;
        return wfb.m23906a(aq4Var.mo1695q(e28Var3.m10805f()), aq4Var.mo1695q(e28Var3.m10802c()));
    }

    /* JADX INFO: renamed from: h */
    public static String m4633h(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM22991n;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strM22991n = "null";
            } else {
                try {
                    strM22991n = obj.toString();
                } catch (Exception e) {
                    String strM17735j = AbstractC3393o1.m17735j(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM17735j), (Throwable) e);
                    strM22991n = ux5.m22991n("<", strM17735j, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strM22991n;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4634i(String str) {
        return str == null || str.isEmpty();
    }
}
