package p382s7;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.codeless.internal.EventBinding;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067d8.C5086z;
import p128g2.RunnableC5682t;
import p173i8.C6205a;
import p291o7.C8004n;
import p394t7.C9218d;
import p476x7.C10106e;

/* JADX INFO: renamed from: s7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8968a {

    /* JADX INFO: renamed from: a */
    public static final C8968a f46984a = new C8968a();

    /* JADX INFO: renamed from: s7.a$a */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final EventBinding f46985a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<View> f46986b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<View> f46987c;

        /* JADX INFO: renamed from: d */
        public final View.OnClickListener f46988d;

        /* JADX INFO: renamed from: e */
        public final boolean f46989e = true;

        public a(EventBinding eventBinding, View view, View view2) {
            this.f46985a = eventBinding;
            this.f46986b = new WeakReference<>(view2);
            this.f46987c = new WeakReference<>(view);
            this.f46988d = C9218d.m17569e(view2);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                C5207g.m11111f(view, "view");
                View.OnClickListener onClickListener = this.f46988d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.f46987c.get();
                View view3 = this.f46986b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                C8968a c8968a = C8968a.f46984a;
                C8968a.m17196a(this.f46985a, view2, view3);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        }
    }

    /* JADX INFO: renamed from: s7.a$b */
    public static final class b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final EventBinding f46990a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<AdapterView<?>> f46991b;

        /* JADX INFO: renamed from: c */
        public final WeakReference<View> f46992c;

        /* JADX INFO: renamed from: d */
        public final AdapterView.OnItemClickListener f46993d;

        /* JADX INFO: renamed from: e */
        public final boolean f46994e = true;

        public b(EventBinding eventBinding, View view, AdapterView<?> adapterView) {
            this.f46990a = eventBinding;
            this.f46991b = new WeakReference<>(adapterView);
            this.f46992c = new WeakReference<>(view);
            this.f46993d = adapterView.getOnItemClickListener();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C5207g.m11111f(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f46993d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.f46992c.get();
            AdapterView<?> adapterView2 = this.f46991b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            C8968a c8968a = C8968a.f46984a;
            C8968a.m17196a(this.f46990a, view2, adapterView2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m17196a(EventBinding eventBinding, View view, View view2) {
        if (C6205a.m12742b(C8968a.class)) {
            return;
        }
        try {
            C5207g.m11111f(eventBinding, "mapping");
            String str = eventBinding.f11510a;
            C8971d.a aVar = C8971d.f47006f;
            Bundle bundleM17204b = C8971d.a.m17204b(eventBinding, view, view2);
            f46984a.m17197b(bundleM17204b);
            C8004n.m15873c().execute(new RunnableC5682t(str, 4, bundleM17204b));
        } catch (Throwable th2) {
            C6205a.m12741a(C8968a.class, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17197b(Bundle bundle) {
        double dDoubleValue;
        Locale locale;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                int i10 = C10106e.f51261a;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        C5086z c5086z = C5086z.f33015a;
                        try {
                            locale = C8004n.m15871a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            C5207g.m11110e(locale, "getDefault()");
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
