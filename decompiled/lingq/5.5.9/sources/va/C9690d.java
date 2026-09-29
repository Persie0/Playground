package va;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C2416m;
import com.linguist.R;
import java.util.Locale;
import p479xa.C10134c0;
import p479xa.C10147p;

/* JADX INFO: renamed from: va.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9690d implements InterfaceC9705s {

    /* JADX INFO: renamed from: a */
    public final Resources f49613a;

    public C9690d(Resources resources) {
        resources.getClass();
        this.f49613a = resources;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    @Override // va.InterfaceC9705s
    /* JADX INFO: renamed from: a */
    public final String mo18197a(C2416m c2416m) {
        String strM18199c;
        String strM19104d;
        int iM19108h = C10147p.m19108h(c2416m.f12484l);
        int i10 = c2416m.f12456M;
        int i11 = c2416m.f12463T;
        int i12 = c2416m.f12455L;
        if (iM19108h == -1) {
            String str = null;
            String str2 = c2416m.f12481i;
            if (str2 == null) {
                strM19104d = null;
                break;
            }
            String[] strArrM19032Q = C10134c0.m19032Q(str2);
            int length = strArrM19032Q.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    strM19104d = null;
                    break;
                }
                strM19104d = C10147p.m19104d(strArrM19032Q[i13]);
                if (strM19104d != null && C10147p.m19111k(strM19104d)) {
                    break;
                }
                i13++;
            }
            if (strM19104d == null) {
                if (str2 != null) {
                    for (String str3 : C10134c0.m19032Q(str2)) {
                        String strM19104d2 = C10147p.m19104d(str3);
                        if (strM19104d2 != null && C10147p.m19109i(strM19104d2)) {
                            str = strM19104d2;
                            break;
                        }
                    }
                }
                if (str != null) {
                    iM19108h = 1;
                } else if (i12 != -1 || i10 != -1) {
                    iM19108h = 2;
                } else if (i11 == -1 && c2416m.f12464U == -1) {
                    iM19108h = -1;
                } else {
                    iM19108h = 1;
                }
            } else {
                iM19108h = 2;
            }
        }
        String string = "";
        Resources resources = this.f49613a;
        if (iM19108h == 2) {
            String[] strArr = new String[3];
            strArr[0] = m18200d(c2416m);
            if (i12 != -1 && i10 != -1) {
                string = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i12), Integer.valueOf(i10));
            }
            strArr[1] = string;
            strArr[2] = m18198b(c2416m);
            strM18199c = m18201e(strArr);
        } else if (iM19108h == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = m18199c(c2416m);
            if (i11 != -1 && i11 >= 1) {
                if (i11 == 1) {
                    string = resources.getString(R.string.exo_track_mono);
                } else if (i11 == 2) {
                    string = resources.getString(R.string.exo_track_stereo);
                } else if (i11 == 6 || i11 == 7) {
                    string = resources.getString(R.string.exo_track_surround_5_point_1);
                } else {
                    string = i11 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
                }
            }
            strArr2[1] = string;
            strArr2[2] = m18198b(c2416m);
            strM18199c = m18201e(strArr2);
        } else {
            strM18199c = m18199c(c2416m);
        }
        return strM18199c.length() == 0 ? resources.getString(R.string.exo_track_unknown) : strM18199c;
    }

    /* JADX INFO: renamed from: b */
    public final String m18198b(C2416m c2416m) {
        int i10 = c2416m.f12480h;
        return i10 == -1 ? "" : this.f49613a.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    /* JADX INFO: renamed from: c */
    public final String m18199c(C2416m c2416m) {
        String displayName;
        String[] strArr = new String[2];
        String str = c2416m.f12474c;
        String str2 = "";
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            int i10 = C10134c0.f51354a;
            Locale localeForLanguageTag = i10 >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
            Locale locale = i10 >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        strArr[0] = displayName;
        strArr[1] = m18200d(c2416m);
        String strM18201e = m18201e(strArr);
        if (!TextUtils.isEmpty(strM18201e)) {
            return strM18201e;
        }
        String str3 = c2416m.f12472b;
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public final String m18200d(C2416m c2416m) {
        int i10 = c2416m.f12477e & 2;
        Resources resources = this.f49613a;
        String string = i10 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i11 = c2416m.f12477e;
        if ((i11 & 4) != 0) {
            string = m18201e(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i11 & 8) != 0) {
            string = m18201e(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i11 & 1088) != 0 ? m18201e(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX INFO: renamed from: e */
    public final String m18201e(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                if (TextUtils.isEmpty(string)) {
                    string = str;
                } else {
                    string = this.f49613a.getString(R.string.exo_item_list, string, str);
                }
            }
        }
        return string;
    }
}
