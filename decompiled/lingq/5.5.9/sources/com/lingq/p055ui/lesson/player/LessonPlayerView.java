package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import ni.C7796d;
import p067d8.ViewOnClickListenerC5062d0;
import ph.C8296h4;
import sh.InterfaceC9008d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m13365d2 = {"Lcom/lingq/ui/lesson/player/LessonPlayerView;", "Landroid/widget/FrameLayout;", "Lni/d;", "analytics", "Lsl/e;", "setupViews", "Lsh/d;", "listener", "setPlayerControlsListener", "Lph/h4;", "a", "Lph/h4;", "getBinding", "()Lph/h4;", "binding", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f28726c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C8296h4 binding;

    /* JADX INFO: renamed from: b */
    public InterfaceC9008d f28728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_lesson_player, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.btn_player_back;
        ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_back);
        if (imageView != null) {
            i10 = R.id.btn_player_close;
            ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_close);
            if (imageView2 != null) {
                i10 = R.id.btn_player_expand;
                ImageView imageView3 = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_expand);
                if (imageView3 != null) {
                    i10 = R.id.btn_player_pause_play;
                    ImageView imageView4 = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_pause_play);
                    if (imageView4 != null) {
                        i10 = R.id.view_controls;
                        if (((LinearLayout) C0062b.m298P0(viewInflate, R.id.view_controls)) != null) {
                            this.binding = new C8296h4(imageView, imageView2, imageView3, imageView4);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public final C8296h4 getBinding() {
        return this.binding;
    }

    public final void setPlayerControlsListener(InterfaceC9008d interfaceC9008d) {
        C5207g.m11111f(interfaceC9008d, "listener");
        this.f28728b = interfaceC9008d;
    }

    public final void setupViews(C7796d c7796d) {
        C5207g.m11111f(c7796d, "analytics");
        C8296h4 c8296h4 = this.binding;
        c8296h4.f44869d.setOnClickListener(new ViewOnClickListenerC5062d0(12, this));
        c8296h4.f44866a.setOnClickListener(new ViewOnClickListenerC2238x(18, this));
        c8296h4.f44867b.setOnClickListener(new ViewOnClickListenerC2239y(27, this));
    }
}
