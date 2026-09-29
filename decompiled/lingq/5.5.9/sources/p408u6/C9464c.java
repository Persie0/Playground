package p408u6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.inbox.C2246a;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p171i6.C6202g;
import p290o6.C7979r0;
import p499y4.AbstractC10290a;

/* JADX INFO: renamed from: u6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9464c extends AbstractC10290a {

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> f48500c;

    /* JADX INFO: renamed from: d */
    public final Context f48501d;

    /* JADX INFO: renamed from: e */
    public final CTInboxMessage f48502e;

    /* JADX INFO: renamed from: f */
    public final LinearLayout.LayoutParams f48503f;

    /* JADX INFO: renamed from: g */
    public final WeakReference<C2246a> f48504g;

    /* JADX INFO: renamed from: h */
    public final int f48505h;

    /* JADX INFO: renamed from: i */
    public View f48506i;

    /* JADX INFO: renamed from: u6.c$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f48507a;

        public a(int i10) {
            this.f48507a = i10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C9464c c9464c = C9464c.this;
            C2246a c2246a = c9464c.f48504g.get();
            if (c2246a != null) {
                c2246a.m6557p0(c9464c.f48505h, this.f48507a, true);
            }
        }
    }

    public C9464c(Context context, C2246a c2246a, CTInboxMessage cTInboxMessage, LinearLayout.LayoutParams layoutParams, int i10) {
        this.f48501d = context;
        this.f48504g = new WeakReference<>(c2246a);
        cTInboxMessage.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<CTInboxMessageContent> it = cTInboxMessage.f11285j.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f11294g);
        }
        this.f48500c = arrayList;
        this.f48503f = layoutParams;
        this.f48502e = cTInboxMessage;
        this.f48505h = i10;
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: a */
    public final void mo3731a(ViewGroup viewGroup, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: c */
    public final int mo17877c() {
        return this.f48500c.size();
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: e */
    public final Object mo17878e(ViewGroup viewGroup, int i10) {
        CTInboxMessage cTInboxMessage = this.f48502e;
        this.f48506i = ((LayoutInflater) this.f48501d.getSystemService("layout_inflater")).inflate(R.layout.inbox_carousel_image_layout, viewGroup, false);
        try {
            if (cTInboxMessage.f11271H.equalsIgnoreCase("l")) {
                m17879k((ImageView) this.f48506i.findViewById(R.id.imageView), this.f48506i, i10, viewGroup);
            } else if (cTInboxMessage.f11271H.equalsIgnoreCase("p")) {
                m17879k((ImageView) this.f48506i.findViewById(R.id.squareImageView), this.f48506i, i10, viewGroup);
            }
        } catch (NoClassDefFoundError unused) {
            C2181a.m6449a("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        return this.f48506i;
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: f */
    public final boolean mo3733f(View view, Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m17879k(ImageView imageView, View view, int i10, ViewGroup viewGroup) {
        Context context = this.f48501d;
        ArrayList<String> arrayList = this.f48500c;
        imageView.setVisibility(0);
        try {
            ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6259o(arrayList.get(i10)).m6242A(new C6202g().m12722k(C7979r0.m15842i(context, "ct_image")).m12719g(C7979r0.m15842i(context, "ct_image"))).m6245E(imageView);
        } catch (NoSuchMethodError unused) {
            C2181a.m6449a("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
            ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6259o(arrayList.get(i10)).m6245E(imageView);
        }
        viewGroup.addView(view, this.f48503f);
        view.setOnClickListener(new a(i10));
    }
}
