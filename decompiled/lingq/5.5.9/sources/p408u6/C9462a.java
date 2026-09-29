package p408u6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.inbox.C2246a;
import com.clevertap.android.sdk.inbox.CTCarouselViewPager;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.linguist.R;
import java.util.ArrayList;
import p286o2.C7906f;

/* JADX INFO: renamed from: u6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9462a extends C9467f {

    /* JADX INFO: renamed from: J */
    public final TextView f48484J;

    /* JADX INFO: renamed from: K */
    public final RelativeLayout f48485K;

    /* JADX INFO: renamed from: L */
    public final CTCarouselViewPager f48486L;

    /* JADX INFO: renamed from: M */
    public final LinearLayout f48487M;

    /* JADX INFO: renamed from: u6.a$a */
    public class a implements ViewPager.InterfaceC1209i {

        /* JADX INFO: renamed from: a */
        public final Context f48488a;

        /* JADX INFO: renamed from: b */
        public final ImageView[] f48489b;

        public a(Context context, ImageView[] imageViewArr) {
            this.f48488a = context;
            this.f48489b = imageViewArr;
            ImageView imageView = imageViewArr[0];
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
            imageView.setImageDrawable(C7906f.a.m15676a(resources, R.drawable.ct_selected_dot, null));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1209i
        /* JADX INFO: renamed from: a */
        public final void mo4663a(float f3, int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1209i
        /* JADX INFO: renamed from: b */
        public final void mo4664b(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1209i
        /* JADX INFO: renamed from: c */
        public final void mo4665c(int i10) {
            ImageView[] imageViewArr = this.f48489b;
            int length = imageViewArr.length;
            int i11 = 0;
            while (true) {
                Context context = this.f48488a;
                if (i11 >= length) {
                    ImageView imageView = imageViewArr[i10];
                    Resources resources = context.getResources();
                    ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
                    imageView.setImageDrawable(C7906f.a.m15676a(resources, R.drawable.ct_selected_dot, null));
                    return;
                }
                ImageView imageView2 = imageViewArr[i11];
                Resources resources2 = context.getResources();
                ThreadLocal<TypedValue> threadLocal2 = C7906f.f43056a;
                imageView2.setImageDrawable(C7906f.a.m15676a(resources2, R.drawable.ct_unselected_dot, null));
                i11++;
            }
        }
    }

    public C9462a(View view) {
        super(view);
        this.f48486L = (CTCarouselViewPager) view.findViewById(R.id.image_carousel_viewpager);
        this.f48487M = (LinearLayout) view.findViewById(R.id.sliderDots);
        this.f48484J = (TextView) view.findViewById(R.id.carousel_timestamp);
        this.f48485K = (RelativeLayout) view.findViewById(R.id.body_linear_layout);
    }

    @Override // p408u6.C9467f
    /* JADX INFO: renamed from: t */
    public final void mo17876t(CTInboxMessage cTInboxMessage, C2246a c2246a, int i10) {
        super.mo17876t(cTInboxMessage, c2246a, i10);
        C2246a c2246a2 = this.f48527G.get();
        Context applicationContext = c2246a.m3582e().getApplicationContext();
        ArrayList<CTInboxMessageContent> arrayList = cTInboxMessage.f11285j;
        CTInboxMessageContent cTInboxMessageContent = arrayList.get(0);
        TextView textView = this.f48484J;
        textView.setVisibility(0);
        boolean z10 = cTInboxMessage.f11286k;
        ImageView imageView = this.f48529I;
        if (z10) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        textView.setText(C9467f.m17880s(cTInboxMessage.f11282g));
        textView.setTextColor(Color.parseColor(cTInboxMessageContent.f11299l));
        int color = Color.parseColor(cTInboxMessage.f11277b);
        RelativeLayout relativeLayout = this.f48485K;
        relativeLayout.setBackgroundColor(color);
        CTCarouselViewPager cTCarouselViewPager = this.f48486L;
        cTCarouselViewPager.setAdapter(new C9464c(applicationContext, c2246a, cTInboxMessage, (LinearLayout.LayoutParams) cTCarouselViewPager.getLayoutParams(), i10));
        int size = arrayList.size();
        LinearLayout linearLayout = this.f48487M;
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        C9467f.m17883x(imageViewArr, size, applicationContext, linearLayout);
        ImageView imageView2 = imageViewArr[0];
        Resources resources = applicationContext.getResources();
        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
        imageView2.setImageDrawable(C7906f.a.m15676a(resources, R.drawable.ct_selected_dot, null));
        cTCarouselViewPager.m4642b(new a(c2246a.m3582e().getApplicationContext(), imageViewArr));
        relativeLayout.setOnClickListener(new ViewOnClickListenerC9468g(i10, cTInboxMessage, c2246a2, cTCarouselViewPager));
        m17884w(cTInboxMessage, i10);
    }
}
