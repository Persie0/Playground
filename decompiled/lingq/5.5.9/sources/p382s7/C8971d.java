package p382s7;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.activity.RunnableC0190i;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7661i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;
import p394t7.C9215a;
import p394t7.C9218d;
import p476x7.C10106e;

/* JADX INFO: renamed from: s7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8971d {

    /* JADX INFO: renamed from: f */
    public static final a f47006f = new a();

    /* JADX INFO: renamed from: g */
    public static C8971d f47007g;

    /* JADX INFO: renamed from: a */
    public final Handler f47008a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final Set<Activity> f47009b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f47010c;

    /* JADX INFO: renamed from: d */
    public HashSet<String> f47011d;

    /* JADX INFO: renamed from: e */
    public final HashMap<Integer, HashSet<String>> f47012e;

    /* JADX INFO: renamed from: s7.d$a */
    public static final class a {
        /* JADX INFO: renamed from: b */
        public static Bundle m17204b(EventBinding eventBinding, View view, View view2) {
            Bundle bundle = new Bundle();
            if (eventBinding == null) {
                return bundle;
            }
            List<C9215a> listUnmodifiableList = Collections.unmodifiableList(eventBinding.f11512c);
            C5207g.m11110e(listUnmodifiableList, "unmodifiableList(parameters)");
            for (C9215a c9215a : listUnmodifiableList) {
                String str = c9215a.f47822b;
                String str2 = c9215a.f47821a;
                if (str != null) {
                    if (str.length() > 0) {
                        bundle.putString(str2, c9215a.f47822b);
                    }
                }
                ArrayList arrayList = c9215a.f47823c;
                if (arrayList.size() > 0) {
                    for (b bVar : C5207g.m11106a(c9215a.f47824d, "relative") ? c.a.m17211a(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : c.a.m17211a(view, arrayList, 0, -1, view.getClass().getSimpleName())) {
                        if (bVar.m17206a() != null) {
                            C9218d c9218d = C9218d.f47829a;
                            String strM17573i = C9218d.m17573i(bVar.m17206a());
                            if (strM17573i.length() > 0) {
                                bundle.putString(str2, strM17573i);
                                break;
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final synchronized C8971d m17205a() {
            C8971d c8971d;
            C8971d c8971d2;
            try {
                c8971d = null;
                if (C6205a.m12742b(C8971d.class)) {
                    c8971d2 = null;
                } else {
                    try {
                        c8971d2 = C8971d.f47007g;
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8971d.class, th2);
                        c8971d2 = null;
                    }
                }
                if (c8971d2 == null) {
                    C8971d c8971d3 = new C8971d();
                    if (!C6205a.m12742b(C8971d.class)) {
                        try {
                            C8971d.f47007g = c8971d3;
                        } catch (Throwable th3) {
                            C6205a.m12741a(C8971d.class, th3);
                        }
                    }
                }
                if (!C6205a.m12742b(C8971d.class)) {
                    try {
                        c8971d = C8971d.f47007g;
                    } catch (Throwable th4) {
                        C6205a.m12741a(C8971d.class, th4);
                    }
                }
                if (c8971d == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th5) {
                throw th5;
            }
            return c8971d;
        }
    }

    /* JADX INFO: renamed from: s7.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final WeakReference<View> f47013a;

        /* JADX INFO: renamed from: b */
        public final String f47014b;

        public b(View view, String str) {
            C5207g.m11111f(view, "view");
            C5207g.m11111f(str, "viewMapKey");
            this.f47013a = new WeakReference<>(view);
            this.f47014b = str;
        }

        /* JADX INFO: renamed from: a */
        public final View m17206a() {
            WeakReference<View> weakReference = this.f47013a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* JADX INFO: renamed from: s7.d$c */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference<View> f47015a;

        /* JADX INFO: renamed from: b */
        public ArrayList f47016b;

        /* JADX INFO: renamed from: c */
        public final HashSet<String> f47017c;

        /* JADX INFO: renamed from: d */
        public final String f47018d;

        /* JADX INFO: renamed from: s7.d$c$a */
        public static final class a {
            /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:41:0x0108  */
            /* JADX WARN: Code duplicated, block: B:43:0x0111  */
            /* JADX WARN: Code duplicated, block: B:44:0x0114  */
            /* JADX WARN: Code duplicated, block: B:46:0x0120  */
            /* JADX WARN: Code duplicated, block: B:48:0x0135  */
            /* JADX WARN: Code duplicated, block: B:51:0x013f  */
            /* JADX WARN: Code duplicated, block: B:53:0x014d  */
            /* JADX WARN: Code duplicated, block: B:55:0x0153  */
            /* JADX WARN: Code duplicated, block: B:56:0x0155  */
            /* JADX WARN: Code duplicated, block: B:59:0x0173  */
            /* JADX WARN: Code duplicated, block: B:62:0x017a  */
            /* JADX WARN: Code duplicated, block: B:64:0x0186  */
            /* JADX WARN: Code duplicated, block: B:66:0x019e  */
            /* JADX WARN: Code duplicated, block: B:71:0x01af  */
            /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:77:0x01d3  */
            /* JADX WARN: Code duplicated, block: B:79:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:83:0x01df  */
            /* JADX WARN: Code duplicated, block: B:85:0x01e1  */
            /* JADX WARN: Code duplicated, block: B:87:0x01eb  */
            /* JADX INFO: renamed from: a */
            public static ArrayList m17211a(View view, List list, int i10, int i11, String str) {
                int value;
                int i12;
                String string;
                boolean z10;
                String str2;
                String strM17571g;
                String str3;
                String string2;
                String str4;
                String strM17573i;
                String str5;
                ArrayList arrayListM17212b;
                int size;
                ArrayList arrayListM17212b2;
                int size2;
                C5207g.m11111f(list, "path");
                C5207g.m11111f(str, "mapKey");
                String str6 = str + '.' + i11;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                int i13 = 0;
                if (i10 >= list.size()) {
                    arrayList.add(new b(view, str6));
                } else {
                    PathComponent pathComponent = (PathComponent) list.get(i10);
                    if (C5207g.m11106a(pathComponent.f11514a, "..")) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (arrayListM17212b = m17212b((ViewGroup) parent)).size()) > 0) {
                            while (true) {
                                int i14 = i13 + 1;
                                arrayList.addAll(m17211a((View) arrayListM17212b.get(i13), list, i10 + 1, i13, str6));
                                if (i14 >= size) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        return arrayList;
                    }
                    String str7 = pathComponent.f11514a;
                    if (C5207g.m11106a(str7, ".")) {
                        arrayList.add(new b(view, str6));
                        return arrayList;
                    }
                    int i15 = pathComponent.f11515b;
                    if (i15 == -1 || i11 == i15) {
                        if (C5207g.m11106a(view.getClass().getCanonicalName(), str7)) {
                            value = PathComponent.MatchBitmaskType.ID.getValue();
                            i12 = pathComponent.f11521h;
                            if ((value & i12) > 0) {
                                if (pathComponent.f11516c != view.getId()) {
                                    if ((PathComponent.MatchBitmaskType.TEXT.getValue() & i12) > 0) {
                                        strM17573i = C9218d.m17573i(view);
                                        String strM10821f = C5086z.m10821f(C5086z.m10814M(strM17573i));
                                        str5 = pathComponent.f11517d;
                                        if (C5207g.m11106a(str5, strM17573i) || C5207g.m11106a(str5, strM10821f)) {
                                            string = "";
                                            if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                                if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                    strM17571g = C9218d.m17571g(view);
                                                    String strM10821f2 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                    str3 = pathComponent.f11520g;
                                                    if (!C5207g.m11106a(str3, strM17571g) || C5207g.m11106a(str3, strM10821f2)) {
                                                    }
                                                }
                                                if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                    string = view.getTag() != null ? view.getTag().toString() : "";
                                                    String strM10821f3 = C5086z.m10821f(C5086z.m10814M(string));
                                                    str2 = pathComponent.f11518e;
                                                    if (!C5207g.m11106a(str2, string) || C5207g.m11106a(str2, strM10821f3)) {
                                                    }
                                                }
                                                z10 = true;
                                            } else {
                                                if (view.getContentDescription() == null) {
                                                    string2 = string;
                                                } else {
                                                    string2 = view.getContentDescription().toString();
                                                }
                                                String strM10821f4 = C5086z.m10821f(C5086z.m10814M(string2));
                                                str4 = pathComponent.f11519f;
                                                if (C5207g.m11106a(str4, string2) || C5207g.m11106a(str4, strM10821f4)) {
                                                    if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                        strM17571g = C9218d.m17571g(view);
                                                        String strM10821f5 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                        str3 = pathComponent.f11520g;
                                                        if (!C5207g.m11106a(str3, strM17571g)) {
                                                        }
                                                    }
                                                    if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM10821f6 = C5086z.m10821f(C5086z.m10814M(string));
                                                        str2 = pathComponent.f11518e;
                                                        if (!C5207g.m11106a(str2, string)) {
                                                        }
                                                    }
                                                    z10 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        string = "";
                                        if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                strM17571g = C9218d.m17571g(view);
                                                String strM10821f7 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                str3 = pathComponent.f11520g;
                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                }
                                            }
                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                if (view.getTag() != null) {
                                                }
                                                String strM10821f8 = C5086z.m10821f(C5086z.m10814M(string));
                                                str2 = pathComponent.f11518e;
                                                if (!C5207g.m11106a(str2, string)) {
                                                }
                                            }
                                            z10 = true;
                                        } else {
                                            if (view.getContentDescription() == null) {
                                                string2 = string;
                                            } else {
                                                string2 = view.getContentDescription().toString();
                                            }
                                            String strM10821f9 = C5086z.m10821f(C5086z.m10814M(string2));
                                            str4 = pathComponent.f11519f;
                                            if (C5207g.m11106a(str4, string2)) {
                                                if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                    strM17571g = C9218d.m17571g(view);
                                                    String strM10821f10 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                    str3 = pathComponent.f11520g;
                                                    if (!C5207g.m11106a(str3, strM17571g)) {
                                                    }
                                                }
                                                if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM10821f11 = C5086z.m10821f(C5086z.m10814M(string));
                                                    str2 = pathComponent.f11518e;
                                                    if (!C5207g.m11106a(str2, string)) {
                                                    }
                                                }
                                                z10 = true;
                                            } else {
                                                if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                    strM17571g = C9218d.m17571g(view);
                                                    String strM10821f12 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                    str3 = pathComponent.f11520g;
                                                    if (!C5207g.m11106a(str3, strM17571g)) {
                                                    }
                                                }
                                                if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM10821f13 = C5086z.m10821f(C5086z.m10814M(string));
                                                    str2 = pathComponent.f11518e;
                                                    if (!C5207g.m11106a(str2, string)) {
                                                    }
                                                }
                                                z10 = true;
                                            }
                                        }
                                    }
                                }
                            } else if ((PathComponent.MatchBitmaskType.TEXT.getValue() & i12) > 0) {
                                strM17573i = C9218d.m17573i(view);
                                String strM10821f14 = C5086z.m10821f(C5086z.m10814M(strM17573i));
                                str5 = pathComponent.f11517d;
                                if (C5207g.m11106a(str5, strM17573i)) {
                                    string = "";
                                    if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                            strM17571g = C9218d.m17571g(view);
                                            String strM10821f15 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                            str3 = pathComponent.f11520g;
                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                            }
                                        }
                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                            if (view.getTag() != null) {
                                            }
                                            String strM10821f16 = C5086z.m10821f(C5086z.m10814M(string));
                                            str2 = pathComponent.f11518e;
                                            if (!C5207g.m11106a(str2, string)) {
                                            }
                                        }
                                        z10 = true;
                                    } else {
                                        if (view.getContentDescription() == null) {
                                            string2 = string;
                                        } else {
                                            string2 = view.getContentDescription().toString();
                                        }
                                        String strM10821f17 = C5086z.m10821f(C5086z.m10814M(string2));
                                        str4 = pathComponent.f11519f;
                                        if (C5207g.m11106a(str4, string2)) {
                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                strM17571g = C9218d.m17571g(view);
                                                String strM10821f18 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                str3 = pathComponent.f11520g;
                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                }
                                            }
                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                if (view.getTag() != null) {
                                                }
                                                String strM10821f19 = C5086z.m10821f(C5086z.m10814M(string));
                                                str2 = pathComponent.f11518e;
                                                if (!C5207g.m11106a(str2, string)) {
                                                }
                                            }
                                            z10 = true;
                                        } else {
                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                strM17571g = C9218d.m17571g(view);
                                                String strM10821f110 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                str3 = pathComponent.f11520g;
                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                }
                                            }
                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                if (view.getTag() != null) {
                                                }
                                                String strM10821f111 = C5086z.m10821f(C5086z.m10814M(string));
                                                str2 = pathComponent.f11518e;
                                                if (!C5207g.m11106a(str2, string)) {
                                                }
                                            }
                                            z10 = true;
                                        }
                                    }
                                } else {
                                    string = "";
                                    if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                            strM17571g = C9218d.m17571g(view);
                                            String strM10821f112 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                            str3 = pathComponent.f11520g;
                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                            }
                                        }
                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                            if (view.getTag() != null) {
                                            }
                                            String strM10821f113 = C5086z.m10821f(C5086z.m10814M(string));
                                            str2 = pathComponent.f11518e;
                                            if (!C5207g.m11106a(str2, string)) {
                                            }
                                        }
                                        z10 = true;
                                    } else {
                                        if (view.getContentDescription() == null) {
                                            string2 = string;
                                        } else {
                                            string2 = view.getContentDescription().toString();
                                        }
                                        String strM10821f114 = C5086z.m10821f(C5086z.m10814M(string2));
                                        str4 = pathComponent.f11519f;
                                        if (C5207g.m11106a(str4, string2)) {
                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                strM17571g = C9218d.m17571g(view);
                                                String strM10821f115 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                str3 = pathComponent.f11520g;
                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                }
                                            }
                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                if (view.getTag() != null) {
                                                }
                                                String strM10821f116 = C5086z.m10821f(C5086z.m10814M(string));
                                                str2 = pathComponent.f11518e;
                                                if (!C5207g.m11106a(str2, string)) {
                                                }
                                            }
                                            z10 = true;
                                        } else {
                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                strM17571g = C9218d.m17571g(view);
                                                String strM10821f117 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                str3 = pathComponent.f11520g;
                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                }
                                            }
                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                if (view.getTag() != null) {
                                                }
                                                String strM10821f118 = C5086z.m10821f(C5086z.m10814M(string));
                                                str2 = pathComponent.f11518e;
                                                if (!C5207g.m11106a(str2, string)) {
                                                }
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            } else {
                                string = "";
                                if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                    if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                        strM17571g = C9218d.m17571g(view);
                                        String strM10821f119 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                        str3 = pathComponent.f11520g;
                                        if (!C5207g.m11106a(str3, strM17571g)) {
                                        }
                                    }
                                    if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                        if (view.getTag() != null) {
                                        }
                                        String strM10821f1110 = C5086z.m10821f(C5086z.m10814M(string));
                                        str2 = pathComponent.f11518e;
                                        if (!C5207g.m11106a(str2, string)) {
                                        }
                                    }
                                    z10 = true;
                                } else {
                                    if (view.getContentDescription() == null) {
                                        string2 = string;
                                    } else {
                                        string2 = view.getContentDescription().toString();
                                    }
                                    String strM10821f1111 = C5086z.m10821f(C5086z.m10814M(string2));
                                    str4 = pathComponent.f11519f;
                                    if (C5207g.m11106a(str4, string2)) {
                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                            strM17571g = C9218d.m17571g(view);
                                            String strM10821f1112 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                            str3 = pathComponent.f11520g;
                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                            }
                                        }
                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                            if (view.getTag() != null) {
                                            }
                                            String strM10821f1113 = C5086z.m10821f(C5086z.m10814M(string));
                                            str2 = pathComponent.f11518e;
                                            if (!C5207g.m11106a(str2, string)) {
                                            }
                                        }
                                        z10 = true;
                                    } else {
                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                            strM17571g = C9218d.m17571g(view);
                                            String strM10821f1114 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                            str3 = pathComponent.f11520g;
                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                            }
                                        }
                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                            if (view.getTag() != null) {
                                            }
                                            String strM10821f1115 = C5086z.m10821f(C5086z.m10814M(string));
                                            str2 = pathComponent.f11518e;
                                            if (!C5207g.m11106a(str2, string)) {
                                            }
                                        }
                                        z10 = true;
                                    }
                                }
                            }
                        } else if (new Regex(".*android\\..*").m14271b(str7)) {
                            List listM14299s3 = C7076b.m14299s3(str7, new String[]{"."}, 0, 6);
                            if (!listM14299s3.isEmpty()) {
                                if (C5207g.m11106a(view.getClass().getSimpleName(), (String) listM14299s3.get(listM14299s3.size() - 1))) {
                                    value = PathComponent.MatchBitmaskType.ID.getValue();
                                    i12 = pathComponent.f11521h;
                                    if ((value & i12) > 0) {
                                        if (pathComponent.f11516c != view.getId()) {
                                            if ((PathComponent.MatchBitmaskType.TEXT.getValue() & i12) > 0) {
                                                strM17573i = C9218d.m17573i(view);
                                                String strM10821f120 = C5086z.m10821f(C5086z.m10814M(strM17573i));
                                                str5 = pathComponent.f11517d;
                                                if (C5207g.m11106a(str5, strM17573i)) {
                                                    string = "";
                                                    if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                            strM17571g = C9218d.m17571g(view);
                                                            String strM10821f1116 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                            str3 = pathComponent.f11520g;
                                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                                            }
                                                        }
                                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM10821f1117 = C5086z.m10821f(C5086z.m10814M(string));
                                                            str2 = pathComponent.f11518e;
                                                            if (!C5207g.m11106a(str2, string)) {
                                                            }
                                                        }
                                                        z10 = true;
                                                    } else {
                                                        if (view.getContentDescription() == null) {
                                                            string2 = string;
                                                        } else {
                                                            string2 = view.getContentDescription().toString();
                                                        }
                                                        String strM10821f1118 = C5086z.m10821f(C5086z.m10814M(string2));
                                                        str4 = pathComponent.f11519f;
                                                        if (C5207g.m11106a(str4, string2)) {
                                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                                strM17571g = C9218d.m17571g(view);
                                                                String strM10821f1119 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                                str3 = pathComponent.f11520g;
                                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                                }
                                                            }
                                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM10821f11110 = C5086z.m10821f(C5086z.m10814M(string));
                                                                str2 = pathComponent.f11518e;
                                                                if (!C5207g.m11106a(str2, string)) {
                                                                }
                                                            }
                                                            z10 = true;
                                                        } else {
                                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                                strM17571g = C9218d.m17571g(view);
                                                                String strM10821f11111 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                                str3 = pathComponent.f11520g;
                                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                                }
                                                            }
                                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM10821f11112 = C5086z.m10821f(C5086z.m10814M(string));
                                                                str2 = pathComponent.f11518e;
                                                                if (!C5207g.m11106a(str2, string)) {
                                                                }
                                                            }
                                                            z10 = true;
                                                        }
                                                    }
                                                } else {
                                                    string = "";
                                                    if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                            strM17571g = C9218d.m17571g(view);
                                                            String strM10821f11113 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                            str3 = pathComponent.f11520g;
                                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                                            }
                                                        }
                                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM10821f11114 = C5086z.m10821f(C5086z.m10814M(string));
                                                            str2 = pathComponent.f11518e;
                                                            if (!C5207g.m11106a(str2, string)) {
                                                            }
                                                        }
                                                        z10 = true;
                                                    } else {
                                                        if (view.getContentDescription() == null) {
                                                            string2 = string;
                                                        } else {
                                                            string2 = view.getContentDescription().toString();
                                                        }
                                                        String strM10821f11115 = C5086z.m10821f(C5086z.m10814M(string2));
                                                        str4 = pathComponent.f11519f;
                                                        if (C5207g.m11106a(str4, string2)) {
                                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                                strM17571g = C9218d.m17571g(view);
                                                                String strM10821f11116 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                                str3 = pathComponent.f11520g;
                                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                                }
                                                            }
                                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM10821f11117 = C5086z.m10821f(C5086z.m10814M(string));
                                                                str2 = pathComponent.f11518e;
                                                                if (!C5207g.m11106a(str2, string)) {
                                                                }
                                                            }
                                                            z10 = true;
                                                        } else {
                                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                                strM17571g = C9218d.m17571g(view);
                                                                String strM10821f11118 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                                str3 = pathComponent.f11520g;
                                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                                }
                                                            }
                                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                                if (view.getTag() != null) {
                                                                }
                                                                String strM10821f11119 = C5086z.m10821f(C5086z.m10814M(string));
                                                                str2 = pathComponent.f11518e;
                                                                if (!C5207g.m11106a(str2, string)) {
                                                                }
                                                            }
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                string = "";
                                                if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                                    if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                        strM17571g = C9218d.m17571g(view);
                                                        String strM10821f111110 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                        str3 = pathComponent.f11520g;
                                                        if (!C5207g.m11106a(str3, strM17571g)) {
                                                        }
                                                    }
                                                    if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM10821f111111 = C5086z.m10821f(C5086z.m10814M(string));
                                                        str2 = pathComponent.f11518e;
                                                        if (!C5207g.m11106a(str2, string)) {
                                                        }
                                                    }
                                                    z10 = true;
                                                } else {
                                                    if (view.getContentDescription() == null) {
                                                        string2 = string;
                                                    } else {
                                                        string2 = view.getContentDescription().toString();
                                                    }
                                                    String strM10821f111112 = C5086z.m10821f(C5086z.m10814M(string2));
                                                    str4 = pathComponent.f11519f;
                                                    if (C5207g.m11106a(str4, string2)) {
                                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                            strM17571g = C9218d.m17571g(view);
                                                            String strM10821f111113 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                            str3 = pathComponent.f11520g;
                                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                                            }
                                                        }
                                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM10821f111114 = C5086z.m10821f(C5086z.m10814M(string));
                                                            str2 = pathComponent.f11518e;
                                                            if (!C5207g.m11106a(str2, string)) {
                                                            }
                                                        }
                                                        z10 = true;
                                                    } else {
                                                        if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                            strM17571g = C9218d.m17571g(view);
                                                            String strM10821f111115 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                            str3 = pathComponent.f11520g;
                                                            if (!C5207g.m11106a(str3, strM17571g)) {
                                                            }
                                                        }
                                                        if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                            if (view.getTag() != null) {
                                                            }
                                                            String strM10821f111116 = C5086z.m10821f(C5086z.m10814M(string));
                                                            str2 = pathComponent.f11518e;
                                                            if (!C5207g.m11106a(str2, string)) {
                                                            }
                                                        }
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                        }
                                    } else if ((PathComponent.MatchBitmaskType.TEXT.getValue() & i12) > 0) {
                                        strM17573i = C9218d.m17573i(view);
                                        String strM10821f121 = C5086z.m10821f(C5086z.m10814M(strM17573i));
                                        str5 = pathComponent.f11517d;
                                        if (C5207g.m11106a(str5, strM17573i)) {
                                            string = "";
                                            if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                                if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                    strM17571g = C9218d.m17571g(view);
                                                    String strM10821f111117 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                    str3 = pathComponent.f11520g;
                                                    if (!C5207g.m11106a(str3, strM17571g)) {
                                                    }
                                                }
                                                if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM10821f111118 = C5086z.m10821f(C5086z.m10814M(string));
                                                    str2 = pathComponent.f11518e;
                                                    if (!C5207g.m11106a(str2, string)) {
                                                    }
                                                }
                                                z10 = true;
                                            } else {
                                                if (view.getContentDescription() == null) {
                                                    string2 = string;
                                                } else {
                                                    string2 = view.getContentDescription().toString();
                                                }
                                                String strM10821f111119 = C5086z.m10821f(C5086z.m10814M(string2));
                                                str4 = pathComponent.f11519f;
                                                if (C5207g.m11106a(str4, string2)) {
                                                    if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                        strM17571g = C9218d.m17571g(view);
                                                        String strM10821f1111110 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                        str3 = pathComponent.f11520g;
                                                        if (!C5207g.m11106a(str3, strM17571g)) {
                                                        }
                                                    }
                                                    if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM10821f1111111 = C5086z.m10821f(C5086z.m10814M(string));
                                                        str2 = pathComponent.f11518e;
                                                        if (!C5207g.m11106a(str2, string)) {
                                                        }
                                                    }
                                                    z10 = true;
                                                } else {
                                                    if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                        strM17571g = C9218d.m17571g(view);
                                                        String strM10821f1111112 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                        str3 = pathComponent.f11520g;
                                                        if (!C5207g.m11106a(str3, strM17571g)) {
                                                        }
                                                    }
                                                    if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM10821f1111113 = C5086z.m10821f(C5086z.m10814M(string));
                                                        str2 = pathComponent.f11518e;
                                                        if (!C5207g.m11106a(str2, string)) {
                                                        }
                                                    }
                                                    z10 = true;
                                                }
                                            }
                                        } else {
                                            string = "";
                                            if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                                if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                    strM17571g = C9218d.m17571g(view);
                                                    String strM10821f1111114 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                    str3 = pathComponent.f11520g;
                                                    if (!C5207g.m11106a(str3, strM17571g)) {
                                                    }
                                                }
                                                if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM10821f1111115 = C5086z.m10821f(C5086z.m10814M(string));
                                                    str2 = pathComponent.f11518e;
                                                    if (!C5207g.m11106a(str2, string)) {
                                                    }
                                                }
                                                z10 = true;
                                            } else {
                                                if (view.getContentDescription() == null) {
                                                    string2 = string;
                                                } else {
                                                    string2 = view.getContentDescription().toString();
                                                }
                                                String strM10821f1111116 = C5086z.m10821f(C5086z.m10814M(string2));
                                                str4 = pathComponent.f11519f;
                                                if (C5207g.m11106a(str4, string2)) {
                                                    if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                        strM17571g = C9218d.m17571g(view);
                                                        String strM10821f1111117 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                        str3 = pathComponent.f11520g;
                                                        if (!C5207g.m11106a(str3, strM17571g)) {
                                                        }
                                                    }
                                                    if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM10821f1111118 = C5086z.m10821f(C5086z.m10814M(string));
                                                        str2 = pathComponent.f11518e;
                                                        if (!C5207g.m11106a(str2, string)) {
                                                        }
                                                    }
                                                    z10 = true;
                                                } else {
                                                    if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                        strM17571g = C9218d.m17571g(view);
                                                        String strM10821f1111119 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                        str3 = pathComponent.f11520g;
                                                        if (!C5207g.m11106a(str3, strM17571g)) {
                                                        }
                                                    }
                                                    if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                        if (view.getTag() != null) {
                                                        }
                                                        String strM10821f11111110 = C5086z.m10821f(C5086z.m10814M(string));
                                                        str2 = pathComponent.f11518e;
                                                        if (!C5207g.m11106a(str2, string)) {
                                                        }
                                                    }
                                                    z10 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        string = "";
                                        if ((PathComponent.MatchBitmaskType.DESCRIPTION.getValue() & i12) <= 0) {
                                            if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                strM17571g = C9218d.m17571g(view);
                                                String strM10821f11111111 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                str3 = pathComponent.f11520g;
                                                if (!C5207g.m11106a(str3, strM17571g)) {
                                                }
                                            }
                                            if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                if (view.getTag() != null) {
                                                }
                                                String strM10821f11111112 = C5086z.m10821f(C5086z.m10814M(string));
                                                str2 = pathComponent.f11518e;
                                                if (!C5207g.m11106a(str2, string)) {
                                                }
                                            }
                                            z10 = true;
                                        } else {
                                            if (view.getContentDescription() == null) {
                                                string2 = string;
                                            } else {
                                                string2 = view.getContentDescription().toString();
                                            }
                                            String strM10821f11111113 = C5086z.m10821f(C5086z.m10814M(string2));
                                            str4 = pathComponent.f11519f;
                                            if (C5207g.m11106a(str4, string2)) {
                                                if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                    strM17571g = C9218d.m17571g(view);
                                                    String strM10821f11111114 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                    str3 = pathComponent.f11520g;
                                                    if (!C5207g.m11106a(str3, strM17571g)) {
                                                    }
                                                }
                                                if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM10821f11111115 = C5086z.m10821f(C5086z.m10814M(string));
                                                    str2 = pathComponent.f11518e;
                                                    if (!C5207g.m11106a(str2, string)) {
                                                    }
                                                }
                                                z10 = true;
                                            } else {
                                                if ((PathComponent.MatchBitmaskType.HINT.getValue() & i12) > 0) {
                                                    strM17571g = C9218d.m17571g(view);
                                                    String strM10821f11111116 = C5086z.m10821f(C5086z.m10814M(strM17571g));
                                                    str3 = pathComponent.f11520g;
                                                    if (!C5207g.m11106a(str3, strM17571g)) {
                                                    }
                                                }
                                                if ((PathComponent.MatchBitmaskType.TAG.getValue() & i12) > 0) {
                                                    if (view.getTag() != null) {
                                                    }
                                                    String strM10821f11111117 = C5086z.m10821f(C5086z.m10814M(string));
                                                    str2 = pathComponent.f11518e;
                                                    if (!C5207g.m11106a(str2, string)) {
                                                    }
                                                }
                                                z10 = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            return arrayList;
                        }
                        if (i10 == list.size() - 1) {
                            arrayList.add(new b(view, str6));
                        }
                    }
                    z10 = false;
                    if (!z10) {
                        return arrayList;
                    }
                    if (i10 == list.size() - 1) {
                        arrayList.add(new b(view, str6));
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (arrayListM17212b2 = m17212b((ViewGroup) view)).size()) > 0) {
                    while (true) {
                        int i16 = i13 + 1;
                        arrayList.addAll(m17211a((View) arrayListM17212b2.get(i13), list, i10 + 1, i13, str6));
                        if (i16 >= size2) {
                            break;
                        }
                        i13 = i16;
                    }
                }
                return arrayList;
            }

            /* JADX INFO: renamed from: b */
            public static ArrayList m17212b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            arrayList.add(childAt);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }
        }

        public c(View view, Handler handler, HashSet<String> hashSet, String str) {
            C5207g.m11111f(handler, "handler");
            C5207g.m11111f(hashSet, "listenerSet");
            this.f47015a = new WeakReference<>(view);
            this.f47017c = hashSet;
            this.f47018d = str;
            handler.postDelayed(this, 200L);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002a  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m17207a(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            C8968a.a aVar;
            View viewM17206a = bVar.m17206a();
            if (viewM17206a == null) {
                return;
            }
            View.OnClickListener onClickListenerM17569e = C9218d.m17569e(viewM17206a);
            if (!(onClickListenerM17569e instanceof C8968a.a)) {
                z10 = false;
            } else {
                if (onClickListenerM17569e == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((C8968a.a) onClickListenerM17569e).f46989e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            HashSet<String> hashSet = this.f47017c;
            String str = bVar.f47014b;
            if (!hashSet.contains(str) && !z10) {
                C8968a c8968a = C8968a.f46984a;
                if (!C6205a.m12742b(C8968a.class)) {
                    try {
                        aVar = new C8968a.a(eventBinding, view, viewM17206a);
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8968a.class, th2);
                        aVar = null;
                    }
                    viewM17206a.setOnClickListener(aVar);
                    hashSet.add(str);
                }
                aVar = null;
                viewM17206a.setOnClickListener(aVar);
                hashSet.add(str);
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002d  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final void m17208b(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            C8968a.b bVar2;
            AdapterView adapterView = (AdapterView) bVar.m17206a();
            if (adapterView == null) {
                return;
            }
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (!(onItemClickListener instanceof C8968a.b)) {
                z10 = false;
            } else {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((C8968a.b) onItemClickListener).f46994e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            HashSet<String> hashSet = this.f47017c;
            String str = bVar.f47014b;
            if (hashSet.contains(str) || z10) {
                return;
            }
            C8968a c8968a = C8968a.f46984a;
            if (C6205a.m12742b(C8968a.class)) {
                bVar2 = null;
            } else {
                try {
                    bVar2 = new C8968a.b(eventBinding, view, adapterView);
                } catch (Throwable th2) {
                    C6205a.m12741a(C8968a.class, th2);
                    bVar2 = null;
                }
            }
            adapterView.setOnItemClickListener(bVar2);
            hashSet.add(str);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002a  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final void m17209c(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            C8972e.a aVar;
            View viewM17206a = bVar.m17206a();
            if (viewM17206a == null) {
                return;
            }
            View.OnTouchListener onTouchListenerM17570f = C9218d.m17570f(viewM17206a);
            if (!(onTouchListenerM17570f instanceof C8972e.a)) {
                z10 = false;
            } else {
                if (onTouchListenerM17570f == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((C8972e.a) onTouchListenerM17570f).f47024e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            HashSet<String> hashSet = this.f47017c;
            String str = bVar.f47014b;
            if (!hashSet.contains(str) && !z10) {
                int i10 = C8972e.f47019a;
                if (C6205a.m12742b(C8972e.class)) {
                    aVar = null;
                } else {
                    try {
                        aVar = new C8972e.a(eventBinding, view, viewM17206a);
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8972e.class, th2);
                        aVar = null;
                    }
                }
                viewM17206a.setOnTouchListener(aVar);
                hashSet.add(str);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
        /* JADX INFO: renamed from: d */
        public final void m17210d() {
            View view;
            boolean zM11106a;
            ArrayList arrayList = this.f47016b;
            if (arrayList == null) {
                return;
            }
            WeakReference<View> weakReference = this.f47015a;
            if (weakReference.get() == null) {
                return;
            }
            int i10 = -1;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                EventBinding eventBinding = (EventBinding) arrayList.get(i11);
                View view2 = weakReference.get();
                if (eventBinding != null && view2 != null) {
                    String str = eventBinding.f11513d;
                    boolean z10 = str == null || str.length() == 0;
                    String str2 = this.f47018d;
                    if (z10 || C5207g.m11106a(str, str2)) {
                        List listUnmodifiableList = Collections.unmodifiableList(eventBinding.f11511b);
                        C5207g.m11110e(listUnmodifiableList, "unmodifiableList(path)");
                        if (listUnmodifiableList.size() <= 25) {
                            for (b bVar : a.m17211a(view2, listUnmodifiableList, 0, i10, str2)) {
                                try {
                                    View viewM17206a = bVar.m17206a();
                                    if (viewM17206a != null) {
                                        C9218d c9218d = C9218d.f47829a;
                                        if (C6205a.m12742b(C9218d.class)) {
                                            view = null;
                                            break;
                                        }
                                        view = viewM17206a;
                                        while (true) {
                                            if (view != null) {
                                                try {
                                                    C9218d c9218d2 = C9218d.f47829a;
                                                    c9218d2.getClass();
                                                    if (C6205a.m12742b(c9218d2)) {
                                                        zM11106a = false;
                                                    } else {
                                                        try {
                                                            zM11106a = C5207g.m11106a(view.getClass().getName(), "com.facebook.react.ReactRootView");
                                                        } catch (Throwable th2) {
                                                            C6205a.m12741a(c9218d2, th2);
                                                            zM11106a = false;
                                                        }
                                                    }
                                                    if (zM11106a) {
                                                        break;
                                                    }
                                                    Object parent = view.getParent();
                                                    if (parent instanceof View) {
                                                        view = (View) parent;
                                                    }
                                                } catch (Throwable th3) {
                                                    C6205a.m12741a(C9218d.class, th3);
                                                }
                                            }
                                            view = null;
                                            break;
                                        }
                                        if (view != null && C9218d.f47829a.m17578l(viewM17206a, view)) {
                                            m17209c(bVar, view2, eventBinding);
                                        } else if (!C7661i.m15256V2(viewM17206a.getClass().getName(), "com.facebook.react", false)) {
                                            if (!(viewM17206a instanceof AdapterView)) {
                                                m17207a(bVar, view2, eventBinding);
                                            } else if (viewM17206a instanceof ListView) {
                                                m17208b(bVar, view2, eventBinding);
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    C5086z c5086z = C5086z.f33015a;
                                    C5086z.m10806E(C6205a.m12742b(C8971d.class) ? null : "s7.d", e10);
                                }
                            }
                        }
                    }
                }
                if (i12 > size) {
                    return;
                }
                i11 = i12;
                i10 = -1;
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            m17210d();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            m17210d();
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0048  */
        @Override // java.lang.Runnable
        public final void run() {
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
                if (c5074nM6670b != null && c5074nM6670b.f32976j) {
                    JSONArray jSONArray = c5074nM6670b.f32977k;
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        try {
                            int length = jSONArray.length();
                            if (length > 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                    C5207g.m11110e(jSONObject, "array.getJSONObject(i)");
                                    arrayList.add(EventBinding.C2295a.m6647a(jSONObject));
                                    if (i11 >= length) {
                                        break;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                            }
                        } catch (IllegalArgumentException | JSONException unused) {
                        }
                    }
                    this.f47016b = arrayList;
                    View view = this.f47015a.get();
                    if (view == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    m17210d();
                }
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        }
    }

    public C8971d() {
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C5207g.m11110e(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f47009b = setNewSetFromMap;
        this.f47010c = new LinkedHashSet();
        this.f47011d = new HashSet<>();
        this.f47012e = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m17201a(Activity activity) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(activity, "activity");
            if (C5207g.m11106a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f47009b.add(activity);
            this.f47011d.clear();
            HashSet<String> hashSet = this.f47012e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f47011d = hashSet;
            }
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    m17202b();
                } else {
                    this.f47008a.post(new RunnableC0190i(9, this));
                }
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17202b() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            while (true) {
                for (Activity activity : this.f47009b) {
                    if (activity != null) {
                        this.f47010c.add(new c(C10106e.m18963b(activity), this.f47008a, this.f47011d, activity.getClass().getSimpleName()));
                    }
                }
                return;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17203c(Activity activity) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(activity, "activity");
            if (C5207g.m11106a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f47009b.remove(activity);
            this.f47010c.clear();
            this.f47012e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f47011d.clone());
            this.f47011d.clear();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
