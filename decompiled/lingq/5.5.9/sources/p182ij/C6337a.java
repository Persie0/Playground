package p182ij;

import android.content.Context;
import android.text.StaticLayout;
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import com.lingq.p055ui.token.TokenTransliteration;
import com.lingq.shared.storage.LessonFont;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import mo.C7661i;
import p265mj.C7567a;
import p265mj.C7570d;

/* JADX INFO: renamed from: ij.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6337a {

    /* JADX INFO: renamed from: a */
    public StaticLayout f36635a;

    /* JADX INFO: renamed from: b */
    public float f36636b;

    /* JADX INFO: renamed from: c */
    public float f36637c;

    /* JADX INFO: renamed from: e */
    public int f36639e;

    /* JADX INFO: renamed from: f */
    public int f36640f;

    /* JADX INFO: renamed from: h */
    public boolean f36642h;

    /* JADX INFO: renamed from: i */
    public boolean f36643i;

    /* JADX INFO: renamed from: m */
    public int f36647m;

    /* JADX INFO: renamed from: p */
    public int f36650p;

    /* JADX INFO: renamed from: q */
    public int f36651q;

    /* JADX INFO: renamed from: d */
    public final ArrayList f36638d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public String f36641g = "";

    /* JADX INFO: renamed from: j */
    public LessonFont f36644j = LessonFont.Rubik.INSTANCE;

    /* JADX INFO: renamed from: k */
    public double f36645k = 1.0d;

    /* JADX INFO: renamed from: l */
    public String f36646l = "";

    /* JADX INFO: renamed from: n */
    public String f36648n = "";

    /* JADX INFO: renamed from: o */
    public final LinkedHashMap f36649o = new LinkedHashMap();

    public C6337a(Context context) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final int m12966a(StaticLayout staticLayout, List list, int i10, String str, int i11, ArrayList arrayList, int i12) {
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        int lineVisibleEnd = staticLayout.getLineVisibleEnd(i10);
        if (lineVisibleEnd > str.length()) {
            lineVisibleEnd = str.length();
        }
        if (lineVisibleEnd < i11) {
            lineVisibleEnd = str.length();
        }
        String strSubstring = str.substring(i11, lineVisibleEnd);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        int i16 = 0;
        int i17 = 1;
        if (C7661i.m15256V2(strSubstring, "\n\n", false)) {
            this.f36650p += 2;
            strSubstring = strSubstring.substring(2, strSubstring.length());
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else if (C7661i.m15256V2(strSubstring, "\n", false)) {
            this.f36650p++;
            strSubstring = strSubstring.substring(1, strSubstring.length());
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else if (C7661i.m15256V2(strSubstring, " ", false)) {
            this.f36650p++;
            strSubstring = strSubstring.substring(1, strSubstring.length());
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        int length = strSubstring.length() + this.f36650p;
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            if (this.f36651q >= list.size()) {
                i13 = i16;
                arrayList2 = arrayList3;
                break;
            }
            C7570d c7570d = (C7570d) list.get(this.f36651q);
            int i18 = c7570d.f41721a;
            int i19 = this.f36650p;
            LinkedHashMap linkedHashMap = this.f36649o;
            if (i18 < i19 || (i15 = c7570d.f41722b) > length) {
                int i20 = (i19 > i18 || i18 >= length) ? i16 : i17;
                String str2 = c7570d.f41725e;
                if (i20 == 0 || (i14 = c7570d.f41722b) <= length) {
                    arrayList2 = arrayList3;
                    if (i18 < i19) {
                        c7570d.f41722b = str2.length() - (this.f36650p - c7570d.f41721a);
                        c7570d.f41721a = 0;
                        c7570d.f41733m = arrayList.size();
                        arrayList2.add(c7570d);
                        linkedHashMap.put(Integer.valueOf(this.f36651q), c7570d);
                        i17 = 1;
                        this.f36651q++;
                        arrayList3 = arrayList2;
                        i16 = 0;
                    }
                } else {
                    int i21 = c7570d.f41723c;
                    int i22 = c7570d.f41724d;
                    int i23 = c7570d.f41726f;
                    int i24 = c7570d.f41727g;
                    int i25 = c7570d.f41728h;
                    String str3 = c7570d.f41729i;
                    TokenTransliteration tokenTransliteration = c7570d.f41730j;
                    int i26 = c7570d.f41732l;
                    int i27 = c7570d.f41733m;
                    ArrayList arrayList4 = arrayList3;
                    boolean z10 = c7570d.f41734n;
                    C5207g.m11111f(str2, "text");
                    C5207g.m11111f(str3, "scriptToUse");
                    TextTokenType textTokenType = c7570d.f41731k;
                    C5207g.m11111f(textTokenType, "type");
                    C7570d c7570d2 = new C7570d(i18, i14, i21, i22, str2, i23, i24, i25, str3, tokenTransliteration, textTokenType, i26, i27, z10);
                    c7570d2.f41721a -= this.f36650p;
                    c7570d2.f41722b = strSubstring.length();
                    c7570d.f41733m = arrayList.size();
                    arrayList2 = arrayList4;
                    arrayList2.add(c7570d2);
                    linkedHashMap.put(Integer.valueOf(this.f36651q), c7570d2);
                }
                i13 = 0;
                i17 = 1;
                break;
            }
            c7570d.f41721a = i18 - i19;
            c7570d.f41722b = i15 - i19;
            c7570d.f41733m = arrayList.size();
            arrayList3.add(c7570d);
            linkedHashMap.put(Integer.valueOf(this.f36651q), c7570d);
            this.f36651q += i17;
        }
        arrayList.add(new C7567a(arrayList.isEmpty(), strSubstring, arrayList2, i10 == i12 + (-1) ? i17 : i13, this.f36644j, this.f36645k, this.f36647m, this.f36643i, this.f36646l));
        int length2 = strSubstring.length() + this.f36650p;
        this.f36650p = length2;
        return length2;
    }
}
