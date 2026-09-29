package p333q7;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import p173i8.C6205a;
import p394t7.C9218d;

/* JADX INFO: renamed from: q7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8501c {

    /* JADX INFO: renamed from: a */
    public static final C8501c f45744a = new C8501c();

    /* JADX INFO: renamed from: a */
    public static final ArrayList m16598a(View view) {
        if (C6205a.m12742b(C8501c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupM17572h = C9218d.m17572h(view);
            if (viewGroupM17572h != null) {
                Iterator it = C9218d.m17566a(viewGroupM17572h).iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        View view2 = (View) it.next();
                        if (view != view2) {
                            arrayList.addAll(f45744a.m16601c(view2));
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C6205a.m12741a(C8501c.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX INFO: renamed from: b */
    public static final ArrayList m16599b(View view) {
        if (C6205a.m12742b(C8501c.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(C9218d.m17571g(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    C5207g.m11110e(resourceName, "resourceName");
                    Object[] array = new Regex("/").m14273d(resourceName).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if ((str.length() > 0) && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            C6205a.m12741a(C8501c.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:6:0x001d->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final boolean m16600d(ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        if (C6205a.m12742b(C8501c.class)) {
            return false;
        }
        try {
            C5207g.m11111f(arrayList, "indicators");
            C5207g.m11111f(arrayList2, "keys");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C8501c c8501c = f45744a;
                c8501c.getClass();
                if (!C6205a.m12742b(c8501c)) {
                    try {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C7076b.m14278X2(str, (String) it2.next(), false)) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        C6205a.m12741a(c8501c, th2);
                    }
                }
                z10 = false;
                if (z10) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            C6205a.m12741a(C8501c.class, th3);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m16601c(View view) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator it = C9218d.m17566a(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m16601c((View) it.next()));
                }
                return arrayList;
            }
            String string = ((TextView) view).getText().toString();
            if ((string.length() > 0) && string.length() < 100) {
                String lowerCase = string.toLowerCase();
                C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
