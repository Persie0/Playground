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
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.LessonMenuItem;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import ni.C7793a;
import p199jd.ViewOnClickListenerC6464i;
import p254m2.C7472a;
import sl.C9072e;

/* JADX INFO: renamed from: yi.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10372b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<LessonMenuItem, C9072e> f52132a;

    public C10372b0(View view, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC2052l interfaceC2052l, int i10) {
        boolean z14 = (i10 & 2) != 0 ? false : z10;
        boolean z15 = (i10 & 4) != 0 ? false : z11;
        boolean z16 = (i10 & 8) != 0 ? false : z12;
        boolean z17 = (i10 & 16) != 0 ? false : z13;
        C5207g.m11111f(view, "view");
        this.f52132a = interfaceC2052l;
        Object systemService = view.getContext().getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_library_lesson, (ViewGroup) null, false);
        int i11 = R.id.btnAddToPlaylist;
        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnAddToPlaylist);
        if (linearLayout != null) {
            i11 = R.id.btnLessonInfo;
            LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnLessonInfo);
            if (linearLayout2 != null) {
                i11 = R.id.btnLike;
                LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnLike);
                if (linearLayout3 != null) {
                    i11 = R.id.btnOpen;
                    LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnOpen);
                    if (linearLayout4 != null) {
                        i11 = R.id.btnReport;
                        LinearLayout linearLayout5 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnReport);
                        if (linearLayout5 != null) {
                            i11 = R.id.btnSaveRemove;
                            LinearLayout linearLayout6 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnSaveRemove);
                            if (linearLayout6 != null) {
                                i11 = R.id.btnViewCourse;
                                LinearLayout linearLayout7 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.btnViewCourse);
                                if (linearLayout7 != null) {
                                    ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivSaveRemove);
                                    if (imageView != null) {
                                        ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate, R.id.like);
                                        if (imageView2 != null) {
                                            TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvLike);
                                            if (textView != null) {
                                                boolean z18 = z16;
                                                TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvOpenLesson);
                                                if (textView2 != null) {
                                                    TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.tvSaveRemove);
                                                    if (textView3 != null) {
                                                        boolean z19 = z15;
                                                        final int i12 = 1;
                                                        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                                                        final int i13 = 0;
                                                        linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: yi.y
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i13;
                                                                C10372b0 c10372b0 = this;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.OpenLesson);
                                                                        break;
                                                                    default:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.AddToPlaylist);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: yi.z
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i13;
                                                                C10372b0 c10372b0 = this;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.LessonInfo);
                                                                        break;
                                                                    default:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.Report);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        linearLayout7.setOnClickListener(new View.OnClickListener() { // from class: yi.a0
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i13;
                                                                C10372b0 c10372b0 = this;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.ViewCourse);
                                                                        break;
                                                                    default:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.UpdateIsTaken);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        linearLayout3.setOnClickListener(new ViewOnClickListenerC6464i(popupWindow, 8, this));
                                                        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: yi.y
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i12;
                                                                C10372b0 c10372b0 = this;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.OpenLesson);
                                                                        break;
                                                                    default:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.AddToPlaylist);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: yi.z
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i12;
                                                                C10372b0 c10372b0 = this;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.LessonInfo);
                                                                        break;
                                                                    default:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.Report);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        linearLayout6.setOnClickListener(new View.OnClickListener() { // from class: yi.a0
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                int i14 = i12;
                                                                C10372b0 c10372b0 = this;
                                                                PopupWindow popupWindow2 = popupWindow;
                                                                switch (i14) {
                                                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.ViewCourse);
                                                                        break;
                                                                    default:
                                                                        C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                        C5207g.m11111f(c10372b0, "this$0");
                                                                        popupWindow2.dismiss();
                                                                        c10372b0.f52132a.mo528n(LessonMenuItem.UpdateIsTaken);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        if (z14) {
                                                            Context context = view.getContext();
                                                            Object obj = C7472a.f41322a;
                                                            imageView2.setImageDrawable(C7472a.c.m14849b(context, R.drawable.ic_heart_filled_s));
                                                            textView.setText(view.getContext().getString(R.string.lingq_likes_past));
                                                        } else {
                                                            Context context2 = view.getContext();
                                                            Object obj2 = C7472a.f41322a;
                                                            imageView2.setImageDrawable(C7472a.c.m14849b(context2, R.drawable.ic_heart_s));
                                                            textView.setText(view.getContext().getString(R.string.lingq_like_present));
                                                        }
                                                        if (z17) {
                                                            imageView.setImageDrawable(C7472a.c.m14849b(view.getContext(), R.drawable.ic_trash));
                                                            textView3.setText(view.getContext().getString(R.string.lesson_unsave_lesson));
                                                        } else {
                                                            imageView.setImageDrawable(C7472a.c.m14849b(view.getContext(), R.drawable.ic_bookmark));
                                                            textView3.setText(view.getContext().getString(R.string.ui_save));
                                                        }
                                                        if (z19) {
                                                            textView2.setText(view.getContext().getString(R.string.feed_import));
                                                            C4924a.m10442U(linearLayout);
                                                            C4924a.m10442U(linearLayout3);
                                                            C4924a.m10442U(linearLayout7);
                                                            C4924a.m10442U(linearLayout6);
                                                        }
                                                        if (z18) {
                                                            C4924a.m10442U(linearLayout7);
                                                        }
                                                        C7793a.m15503g(popupWindow);
                                                        popupWindow.showAsDropDown(view);
                                                        return;
                                                    }
                                                    i11 = R.id.tvSaveRemove;
                                                } else {
                                                    i11 = R.id.tvOpenLesson;
                                                }
                                            } else {
                                                i11 = R.id.tvLike;
                                            }
                                        } else {
                                            i11 = R.id.like;
                                        }
                                    } else {
                                        i11 = R.id.ivSaveRemove;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
