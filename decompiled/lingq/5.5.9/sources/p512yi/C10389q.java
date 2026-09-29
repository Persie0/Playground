package p512yi;

import ae.C0062b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.lingq.p055ui.home.library.CourseMenuItem;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import ni.C7793a;
import p199jd.ViewOnClickListenerC6464i;
import p254m2.C7472a;
import p408u6.ViewOnClickListenerC9466e;
import si.ViewOnClickListenerC9029m;
import sl.C9072e;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: renamed from: yi.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C10389q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<CourseMenuItem, C9072e> f52179a;

    public C10389q(View view, InterfaceC2052l interfaceC2052l, boolean z10, boolean z11) {
        C5207g.m11111f(view, "view");
        this.f52179a = interfaceC2052l;
        Object systemService = view.getContext().getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_library_course, (ViewGroup) null, false);
        int i10 = R.id.btnAddToPlaylist;
        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnAddToPlaylist);
        if (linearLayout != null) {
            i10 = R.id.btnLike;
            LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnLike);
            if (linearLayout2 != null) {
                i10 = R.id.btnReport;
                LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnReport);
                if (linearLayout3 != null) {
                    i10 = R.id.btnViewCourse;
                    LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnViewCourse);
                    if (linearLayout4 != null) {
                        i10 = R.id.like;
                        ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.like);
                        if (imageView != null) {
                            i10 = R.id.tvLike;
                            TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvLike);
                            if (textView != null) {
                                PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                                linearLayout4.setOnClickListener(new ViewOnClickListenerC9029m(popupWindow, 5, this));
                                if (z11) {
                                    linearLayout.setOnClickListener(new ViewOnClickListenerC9734i(popupWindow, 2, this));
                                } else {
                                    C4924a.m10442U(linearLayout);
                                }
                                linearLayout2.setOnClickListener(new ViewOnClickListenerC6464i(popupWindow, 7, this));
                                linearLayout3.setOnClickListener(new ViewOnClickListenerC9466e(popupWindow, 4, this));
                                if (z10) {
                                    Context context = view.getContext();
                                    Object obj = C7472a.f41322a;
                                    imageView.setImageDrawable(C7472a.c.m14849b(context, R.drawable.ic_heart_filled_s));
                                    textView.setText(view.getContext().getString(R.string.lingq_likes_past));
                                } else {
                                    Context context2 = view.getContext();
                                    Object obj2 = C7472a.f41322a;
                                    imageView.setImageDrawable(C7472a.c.m14849b(context2, R.drawable.ic_heart_s));
                                    textView.setText(view.getContext().getString(R.string.lingq_like_present));
                                }
                                C7793a.m15503g(popupWindow);
                                popupWindow.showAsDropDown(view);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
