package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.designsystem.R$bool;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.p012ui.ImageSize;
import com.lingq.core.p012ui.R$drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class jfa {
    /* JADX INFO: renamed from: a */
    public static final boolean m14418a(Context context) {
        return !context.getResources().getBoolean(R$bool.is_phone);
    }

    /* JADX INFO: renamed from: b */
    public static final float m14419b(Context context, int i) {
        context.getClass();
        float f = i;
        Resources resources = context.getResources();
        return TypedValue.applyDimension(1, f, resources != null ? resources.getDisplayMetrics() : null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m14420c(View view) {
        view.getClass();
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m14421d(FeedTopic feedTopic) {
        feedTopic.getClass();
        switch (efa.f37197c[feedTopic.ordinal()]) {
            case 1:
                return R$drawable.ic_topic_books;
            case 2:
                return R$drawable.ic_topic_food;
            case 3:
                return R$drawable.ic_topic_podcasts;
            case 4:
                return R$drawable.ic_topic_news;
            case 5:
                return R$drawable.ic_topic_business;
            case 6:
                return R$drawable.ic_topic_entertainment;
            case 7:
                return R$drawable.ic_topic_sports;
            case 8:
                return R$drawable.ic_topic_technology;
            case 9:
                return R$drawable.ic_topic_pronunciation;
            case 10:
                return R$drawable.ic_topic_grammar;
            case 11:
                return R$drawable.ic_topic_health;
            case 12:
                return R$drawable.ic_topic_science;
            case 13:
                return R$drawable.ic_topic_self_help;
            case 14:
                return R$drawable.ic_topic_culture;
            case 15:
                return R$drawable.ic_topic_travel;
            case 16:
                return R$drawable.ic_topic_politics;
            case 17:
                return R$drawable.ic_topic_language;
            case 18:
                return R$drawable.ic_topic_kids;
            case 19:
                return R$drawable.ic_topic_history;
            case 20:
                return R$drawable.ic_topic_song;
            case 21:
                return R$drawable.ic_topic_youtubers;
            default:
                gm5.m12750e();
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final String m14422e(String str, String str2, ImageSize imageSize) {
        imageSize.getClass();
        if (str == null) {
            str = str2 == null ? "" : str2;
        }
        int i = efa.f37195a[imageSize.ordinal()];
        if (i == 1) {
            return cl9.m4839V(str, "/media/", "/images/480x270/");
        }
        if (i == 2) {
            return cl9.m4839V(str, "/media/", "/images/1280x720/");
        }
        if (i == 3) {
            return str;
        }
        gm5.m12750e();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m14423f(ImageView imageView, Object obj, int i) {
        int i2 = (i & 8) == 0 ? 16 : 8;
        imageView.setImageBitmap(null);
        Context context = imageView.getContext();
        context.getClass();
        float fM14419b = m14419b(context, i2);
        Context context2 = imageView.getContext();
        context2.getClass();
        d04 d04Var = new d04(context2);
        d04Var.f34778c = obj;
        d04Var.f34781f = l70.m15918I(AbstractC3550rv.m20852t0(new l9a[]{new zi8(fM14419b)}));
        d04Var.f34786k = Boolean.FALSE;
        d04Var.f34779d = new p33(26, imageView, imageView);
        d04Var.m9961b();
        e04 e04VarM9960a = d04Var.m9960a();
        Context context3 = imageView.getContext();
        context3.getClass();
        p58.m18903m(context3).m4951b(e04VarM9960a);
    }

    /* JADX INFO: renamed from: g */
    public static void m14424g(View view, float f, float f2, long j, ui3 ui3Var, int i) {
        if ((i & 16) != 0) {
            ui3Var = new e5a(6);
        }
        view.animate().translationXBy(f).translationYBy(f2).setDuration(j).setStartDelay(0L).setListener(new gfa(0, ui3Var)).start();
    }

    /* JADX INFO: renamed from: h */
    public static final void m14425h(View view) {
        view.getClass();
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m14426i(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC0638f m14427j(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (abstractComponentCallbacksC0635c.m2115q()) {
            return abstractComponentCallbacksC0635c.m2106h();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final void m14428k(ud6 ud6Var, t86 t86Var, wd6 wd6Var) {
        ud6Var.getClass();
        r86 r86VarM13127f = ud6Var.f63760b.m13127f();
        if ((r86VarM13127f != null ? r86VarM13127f.m20441g(t86Var.mo234b()) : null) != null) {
            ud6Var.m22687d(t86Var.mo234b(), t86Var.mo233a(), wd6Var);
            return;
        }
        sm5.Companion.getClass();
        h0a.f41641a.mo11431b("Action not found for NavDirections: " + t86Var, new Object[0]);
        r43.m20289a().m20290b(new IllegalArgumentException("Action not found for NavDirections: " + t86Var));
    }

    /* JADX INFO: renamed from: l */
    public static final void m14429l(View view) {
        view.getClass();
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final float m14430m(Context context, int i) {
        context.getClass();
        float f = i;
        Resources resources = context.getResources();
        return TypedValue.applyDimension(2, f, resources != null ? resources.getDisplayMetrics() : null);
    }

    /* JADX INFO: renamed from: n */
    public static final int m14431n(Context context, int i) {
        context.getClass();
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (theme != null) {
            theme.resolveAttribute(i, typedValue, true);
        }
        return typedValue.data;
    }

    /* JADX INFO: renamed from: o */
    public static final C3309ls m14432o(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, vi3 vi3Var) {
        abstractComponentCallbacksC0635c.getClass();
        vi3Var.getClass();
        return new C3309ls(abstractComponentCallbacksC0635c, vi3Var);
    }
}
