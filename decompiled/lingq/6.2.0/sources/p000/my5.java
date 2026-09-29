package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class my5 implements fm1, fd9, v6b, fn9, wk0, e94, xh2, dpb, xoc, o9a {

    /* JADX INFO: renamed from: b */
    public static final my5 f52031b = new my5(0);

    /* JADX INFO: renamed from: c */
    public static final my5 f52032c = new my5(1);

    /* JADX INFO: renamed from: d */
    public static final my5 f52033d = new my5(2);

    /* JADX INFO: renamed from: e */
    public static final my5 f52034e = new my5(3);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ my5 f52035f = new my5(4);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ my5 f52036g = new my5(15);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52037a;

    public /* synthetic */ my5(int i) {
        this.f52037a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m17151b(View view) {
        if (lp1.f49971a.contains(my5.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupM17041i = mta.m17041i(view);
            if (viewGroupM17041i != null) {
                for (View view2 : mta.m17035b(viewGroupM17041i)) {
                    if (view != view2) {
                        arrayList.addAll(f52031b.m17156g(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(my5.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final ArrayList m17152e(View view) {
        if (lp1.f49971a.contains(my5.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(mta.m17040h(view));
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
                    resourceName.getClass();
                    String[] strArr = (String[]) new Regex("/").m15429h(resourceName).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            lp1.m16420a(my5.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m17153f(int i) {
        synchronized (UnmanagedSessionReceiver.f5978a) {
            if (UnmanagedSessionReceiver.f5979b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m17154h(String str, ArrayList arrayList) {
        str.getClass();
        if (!str.equals(LanguageLearn.Japanese.getCode())) {
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).f47623a);
            }
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            arrayList3.add(med.m16800a((String) pair.f47623a, null, (TokenTransliteration) pair.f47624b, null));
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m17155i(ArrayList arrayList, ArrayList arrayList2) {
        if (!lp1.f49971a.contains(my5.class)) {
            try {
                arrayList.getClass();
                arrayList2.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    my5 my5Var = f52031b;
                    if (!lp1.f49971a.contains(my5Var)) {
                        try {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (vk9.m23380c0(str, (String) it2.next(), false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            lp1.m16420a(my5Var, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                lp1.m16420a(my5.class, th2);
                return false;
            }
        }
        return false;
    }

    @Override // p000.v6b
    /* JADX INFO: renamed from: a */
    public r6b mo13180a(Activity activity, gb2 gb2Var) {
        gb2Var.getClass();
        jh0.f45539n.getClass();
        return new r6b(new hh0((Build.VERSION.SDK_INT >= 30 ? kh0.f47284a : x24.f67673b).mo14254b(activity)), gb2Var.mo12459c(activity));
    }

    @Override // p000.o9a
    public /* synthetic */ Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.dpb
    /* JADX INFO: renamed from: c */
    public byte[] mo10577c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        m88 m88Var = (m88) obj;
        try {
            aj0 aj0Var = new aj0();
            m88Var.mo3003e().mo458E(aj0Var);
            return new l88(m88Var.mo3002c(), m88Var.mo3001b(), aj0Var);
        } finally {
            m88Var.close();
        }
    }

    @Override // p000.wk0
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.v6b
    /* JADX INFO: renamed from: d */
    public r6b mo13181d(Context context, gb2 gb2Var) {
        gb2Var.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return mo13180a((Activity) baseContext, gb2Var);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            C3386nv.m17626m("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new r6b(new Rect(0, 0, point.x, point.y), gb2Var.mo12459c(context));
    }

    /* JADX INFO: renamed from: g */
    public ArrayList m17156g(View view) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = mta.m17035b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m17156g((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = wj8.f66934h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.m5975c(bundle) : Tasks.m5975c(null);
    }

    public String toString() {
        switch (this.f52037a) {
            case 2:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }
}
