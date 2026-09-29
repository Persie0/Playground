package com.google.android.exoplayer2.p051ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.PlaybackException;
import com.google.common.collect.ImmutableList;
import com.linguist.R;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p219ka.C6642c;
import p254m2.C7472a;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.InterfaceC10139h;
import p505ya.C10325g;
import p505ya.C10332n;
import va.C9687a;
import va.C9691e;
import va.C9701o;
import za.C10474j;

/* JADX INFO: loaded from: classes.dex */
public class StyledPlayerView extends FrameLayout {
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private final ImageView artworkView;
    private final View bufferingView;
    private final ViewOnLayoutChangeListenerC2508a componentListener;
    private final AspectRatioFrameLayout contentFrame;
    private final C2517d controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private InterfaceC2509b controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private InterfaceC10139h<? super PlaybackException> errorMessageProvider;
    private final TextView errorMessageView;
    private InterfaceC2510c fullscreenButtonClickListener;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;
    private C2517d.l legacyControllerVisibilityListener;
    private final FrameLayout overlayFrameLayout;
    private InterfaceC2532v player;
    private int showBuffering;
    private final View shutterView;
    private final SubtitleView subtitleView;
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$a */
    public final class ViewOnLayoutChangeListenerC2508a implements InterfaceC2532v.c, View.OnLayoutChangeListener, View.OnClickListener, C2517d.l, C2517d.c {

        /* JADX INFO: renamed from: a */
        public final AbstractC2382c0.b f13483a = new AbstractC2382c0.b();

        /* JADX INFO: renamed from: b */
        public Object f13484b;

        public ViewOnLayoutChangeListenerC2508a() {
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: A */
        public final void mo7406A(C2384d0 c2384d0) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            InterfaceC2532v interfaceC2532v = styledPlayerView.player;
            interfaceC2532v.getClass();
            AbstractC2382c0 currentTimeline = interfaceC2532v.isCommandAvailable(17) ? interfaceC2532v.getCurrentTimeline() : AbstractC2382c0.f12057a;
            if (currentTimeline.m6910p()) {
                this.f13484b = null;
            } else {
                boolean zIsCommandAvailable = interfaceC2532v.isCommandAvailable(30);
                AbstractC2382c0.b bVar = this.f13483a;
                if (!zIsCommandAvailable || interfaceC2532v.getCurrentTracks().f12105a.isEmpty()) {
                    Object obj = this.f13484b;
                    if (obj != null) {
                        int iMo6774b = currentTimeline.mo6774b(obj);
                        if (iMo6774b != -1) {
                            if (interfaceC2532v.getCurrentMediaItemIndex() == currentTimeline.mo6777f(iMo6774b, bVar, false).f12065c) {
                                return;
                            }
                        }
                        this.f13484b = null;
                    }
                } else {
                    this.f13484b = currentTimeline.mo6777f(interfaceC2532v.getCurrentPeriodIndex(), bVar, true).f12064b;
                }
            }
            styledPlayerView.updateForCurrentTrackSelections(false);
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: E */
        public final void mo7407E(int i10, boolean z10) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.updateBuffering();
            styledPlayerView.updateControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: J */
        public final void mo7408J(int i10) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.updateBuffering();
            styledPlayerView.updateErrorMessage();
            styledPlayerView.updateControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: O */
        public final void mo7409O(int i10, InterfaceC2532v.d dVar, InterfaceC2532v.d dVar2) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            if (styledPlayerView.isPlayingAd() && styledPlayerView.controllerHideDuringAds) {
                styledPlayerView.hideController();
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: f0 */
        public final void mo7410f0() {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            if (styledPlayerView.shutterView != null) {
                styledPlayerView.shutterView.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: h */
        public final void mo7411h(C10332n c10332n) {
            StyledPlayerView.this.updateAspectRatio();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: j */
        public final void mo7412j(C6642c c6642c) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            if (styledPlayerView.subtitleView != null) {
                styledPlayerView.subtitleView.setCues(c6642c.f37689a);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StyledPlayerView.this.toggleControllerVisibility();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            StyledPlayerView.applyTextureViewRotation((TextureView) view, StyledPlayerView.this.textureViewRotation);
        }

        @Override // com.google.android.exoplayer2.p051ui.C2517d.l
        /* JADX INFO: renamed from: x */
        public final void mo7413x(int i10) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.updateContentDescription();
            if (styledPlayerView.controllerVisibilityListener != null) {
                styledPlayerView.controllerVisibilityListener.m7414a();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$b */
    public interface InterfaceC2509b {
        /* JADX INFO: renamed from: a */
        void m7414a();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$c */
    public interface InterfaceC2510c {
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        int color;
        boolean zHasValue;
        boolean z12;
        int resourceId;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        super(context, attributeSet, i10);
        ViewOnLayoutChangeListenerC2508a viewOnLayoutChangeListenerC2508a = new ViewOnLayoutChangeListenerC2508a();
        this.componentListener = viewOnLayoutChangeListenerC2508a;
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            ImageView imageView = new ImageView(context);
            if (C10134c0.f51354a >= 23) {
                configureEditModeLogoV23(context, getResources(), imageView);
            } else {
                configureEditModeLogo(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9691e.f49617d, i10, 0);
            try {
                zHasValue = typedArrayObtainStyledAttributes.hasValue(27);
                color = typedArrayObtainStyledAttributes.getColor(27, 0);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(14, R.layout.exo_styled_player_view);
                z12 = typedArrayObtainStyledAttributes.getBoolean(32, true);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(8, 0);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, true);
                i12 = typedArrayObtainStyledAttributes.getInt(28, 1);
                i13 = typedArrayObtainStyledAttributes.getInt(16, 0);
                int i17 = typedArrayObtainStyledAttributes.getInt(25, 5000);
                z10 = typedArrayObtainStyledAttributes.getBoolean(10, true);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(3, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(22, 0);
                this.keepContentOnPlayerReset = typedArrayObtainStyledAttributes.getBoolean(11, this.keepContentOnPlayerReset);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(9, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z17;
                i14 = integer;
                z13 = z16;
                i11 = i17;
                i15 = resourceId2;
                z14 = z18;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = 1;
            z10 = true;
            i13 = 0;
            i14 = 0;
            z11 = true;
            color = 0;
            zHasValue = false;
            z12 = true;
            resourceId = 0;
            z13 = true;
            i15 = R.layout.exo_styled_player_view;
            z14 = true;
        }
        LayoutInflater.from(context).inflate(i15, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i13);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.shutterView = viewFindViewById;
        if (viewFindViewById != null && zHasValue) {
            viewFindViewById.setBackgroundColor(color);
        }
        if (aspectRatioFrameLayout == null || i12 == 0) {
            i16 = 0;
            this.surfaceView = null;
            z15 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i12 != 2) {
                if (i12 == 3) {
                    try {
                        int i18 = C10474j.f52385l;
                        this.surfaceView = (View) C10474j.class.getConstructor(Context.class).newInstance(context);
                        z15 = true;
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                } else if (i12 != 4) {
                    this.surfaceView = new SurfaceView(context);
                } else {
                    try {
                        int i19 = C10325g.f51963b;
                        this.surfaceView = (View) C10325g.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e11) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.surfaceView.setLayoutParams(layoutParams);
                this.surfaceView.setOnClickListener(viewOnLayoutChangeListenerC2508a);
                i16 = 0;
                this.surfaceView.setClickable(false);
                aspectRatioFrameLayout.addView(this.surfaceView, 0);
            } else {
                this.surfaceView = new TextureView(context);
            }
            z15 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(viewOnLayoutChangeListenerC2508a);
            i16 = 0;
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
        }
        this.surfaceViewIgnoresVideoAspectRatio = z15;
        this.adOverlayFrameLayout = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.overlayFrameLayout = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.artworkView = imageView2;
        this.useArtwork = (!z12 || imageView2 == null) ? i16 : 1;
        if (resourceId != 0) {
            Context context2 = getContext();
            Object obj = C7472a.f41322a;
            this.defaultArtwork = C7472a.c.m14849b(context2, resourceId);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.m7415a();
            subtitleView.m7416b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.bufferingView = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.showBuffering = i14;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C2517d c2517d = (C2517d) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (c2517d != null) {
            this.controller = c2517d;
        } else if (viewFindViewById3 != null) {
            C2517d c2517d2 = new C2517d(context, attributeSet);
            this.controller = c2517d2;
            c2517d2.setId(R.id.exo_controller);
            c2517d2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c2517d2, iIndexOfChild);
        } else {
            this.controller = null;
        }
        C2517d c2517d3 = this.controller;
        this.controllerShowTimeoutMs = c2517d3 != null ? i11 : i16;
        this.controllerHideOnTouch = z10;
        this.controllerAutoShow = z11;
        this.controllerHideDuringAds = z14;
        this.useController = (!z13 || c2517d3 == null) ? i16 : 1;
        if (c2517d3 != null) {
            C9701o c9701o = c2517d3.f13605a;
            int i20 = c9701o.f49665z;
            if (i20 != 3 && i20 != 2) {
                c9701o.m18208f();
                c9701o.m18211i(2);
            }
            this.controller.f13611d.add(viewOnLayoutChangeListenerC2508a);
        }
        if (z13) {
            setClickable(true);
        }
        updateContentDescription();
    }

    public static /* synthetic */ InterfaceC2510c access$1500(StyledPlayerView styledPlayerView) {
        styledPlayerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f3 = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.postRotate(i10, f3, f10);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f3, f10);
        }
        textureView.setTransform(matrix);
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void configureEditModeLogo(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(C10134c0.m19049p(context, resources, R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
    }

    private static void configureEditModeLogoV23(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(C10134c0.m19049p(context, resources, R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        InterfaceC2532v interfaceC2532v = this.player;
        return interfaceC2532v != null && interfaceC2532v.isCommandAvailable(16) && this.player.isPlayingAd() && this.player.getPlayWhenReady();
    }

    private void maybeShowController(boolean z10) {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            return;
        }
        if (useController()) {
            boolean z11 = this.controller.m7438i() && this.controller.getShowTimeoutMs() <= 0;
            boolean zShouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z10 || z11 || zShouldShowControllerIndefinitely) {
                showController(zShouldShowControllerIndefinitely);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMediaMetadata(InterfaceC2532v interfaceC2532v) {
        byte[] bArr;
        if (interfaceC2532v.isCommandAvailable(18) && (bArr = interfaceC2532v.getMediaMetadata().f12937j) != null) {
            return setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
        }
        return false;
    }

    @RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(this.contentFrame, intrinsicWidth / intrinsicHeight);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r0.getPlayWhenReady() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean shouldShowControllerIndefinitely() {
        InterfaceC2532v interfaceC2532v = this.player;
        boolean z10 = true;
        if (interfaceC2532v == null) {
            return true;
        }
        int playbackState = interfaceC2532v.getPlaybackState();
        if (!this.controllerAutoShow || (this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().m6910p())) {
            z10 = false;
        } else if (playbackState != 1 && playbackState != 4) {
            InterfaceC2532v interfaceC2532v2 = this.player;
            interfaceC2532v2.getClass();
        }
        return z10;
    }

    private void showController(boolean z10) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z10 ? 0 : this.controllerShowTimeoutMs);
            C9701o c9701o = this.controller.f13605a;
            C2517d c2517d = c9701o.f49640a;
            if (!c2517d.m7439j()) {
                c2517d.setVisibility(0);
                c2517d.m7440k();
                View view = c2517d.f13582J;
                if (view != null) {
                    view.requestFocus();
                }
            }
            c9701o.m18212k();
        }
    }

    public static void switchTargetView(InterfaceC2532v interfaceC2532v, StyledPlayerView styledPlayerView, StyledPlayerView styledPlayerView2) {
        if (styledPlayerView == styledPlayerView2) {
            return;
        }
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(interfaceC2532v);
        }
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
        if (useController()) {
            if (this.player == null) {
                return;
            }
            if (!this.controller.m7438i()) {
                maybeShowController(true);
            } else if (this.controllerHideOnTouch) {
                this.controller.m7437h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        InterfaceC2532v interfaceC2532v = this.player;
        C10332n videoSize = interfaceC2532v != null ? interfaceC2532v.getVideoSize() : C10332n.f52011e;
        int i10 = videoSize.f52016a;
        float f3 = 0.0f;
        int i11 = videoSize.f52017b;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f52019d) / i11;
        View view = this.surfaceView;
        if (view instanceof TextureView) {
            int i12 = videoSize.f52018c;
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.textureViewRotation != 0) {
                view.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = i12;
            if (i12 != 0) {
                this.surfaceView.addOnLayoutChangeListener(this.componentListener);
            }
            applyTextureViewRotation((TextureView) this.surfaceView, this.textureViewRotation);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
        if (!this.surfaceViewIgnoresVideoAspectRatio) {
            f3 = f10;
        }
        onContentAspectRatioChanged(aspectRatioFrameLayout, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    public void updateBuffering() {
        boolean z10;
        if (this.bufferingView != null) {
            InterfaceC2532v interfaceC2532v = this.player;
            int i10 = 0;
            if (interfaceC2532v == null || interfaceC2532v.getPlaybackState() != 2) {
                z10 = false;
            } else {
                int i11 = this.showBuffering;
                z10 = true;
                if (i11 != 2 && (i11 != 1 || !this.player.getPlayWhenReady())) {
                    z10 = false;
                }
            }
            View view = this.bufferingView;
            if (!z10) {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        C2517d c2517d = this.controller;
        if (c2517d == null || !this.useController) {
            setContentDescription(null);
        } else if (c2517d.m7438i()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
            } else {
                InterfaceC2532v interfaceC2532v = this.player;
                if (interfaceC2532v != null) {
                    interfaceC2532v.getPlayerError();
                }
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z10) {
        InterfaceC2532v interfaceC2532v = this.player;
        if (interfaceC2532v != null && interfaceC2532v.isCommandAvailable(30) && !interfaceC2532v.getCurrentTracks().f12105a.isEmpty()) {
            if (z10 && !this.keepContentOnPlayerReset) {
                closeShutter();
            }
            if (interfaceC2532v.getCurrentTracks().m6926a(2)) {
                hideArtwork();
                return;
            }
            closeShutter();
            if (!useArtwork() || (!setArtworkFromMediaMetadata(interfaceC2532v) && !setDrawableArtwork(this.defaultArtwork))) {
                hideArtwork();
                return;
            }
            return;
        }
        if (!this.keepContentOnPlayerReset) {
            hideArtwork();
            closeShutter();
        }
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
        if (!this.useArtwork) {
            return false;
        }
        C10129a.m18993e(this.artworkView);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        C10129a.m18993e(this.controller);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC2532v interfaceC2532v = this.player;
        if (interfaceC2532v != null && interfaceC2532v.isCommandAvailable(16) && this.player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zIsDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (zIsDpadKey && useController() && !this.controller.m7438i()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (zIsDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.m7434d(keyEvent);
    }

    public List<C9687a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.overlayFrameLayout != null) {
            arrayList.add(new C9687a(0));
        }
        if (this.controller != null) {
            arrayList.add(new C9687a());
        }
        return ImmutableList.m9060Q(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.adOverlayFrameLayout;
        C10129a.m18994f(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public InterfaceC2532v getPlayer() {
        return this.player;
    }

    public int getResizeMode() {
        C10129a.m18993e(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    public boolean getUseArtwork() {
        return this.useArtwork;
    }

    public boolean getUseController() {
        return this.useController;
    }

    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public void hideController() {
        C2517d c2517d = this.controller;
        if (c2517d != null) {
            c2517d.m7437h();
        }
    }

    public boolean isControllerFullyVisible() {
        C2517d c2517d = this.controller;
        return c2517d != null && c2517d.m7438i();
    }

    public void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f3) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f3);
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (useController() && this.player != null) {
            maybeShowController(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.InterfaceC2506a interfaceC2506a) {
        C10129a.m18993e(this.contentFrame);
        this.contentFrame.setAspectRatioListener(interfaceC2506a);
    }

    public void setControllerAutoShow(boolean z10) {
        this.controllerAutoShow = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.controllerHideDuringAds = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controllerHideOnTouch = z10;
        updateContentDescription();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C2517d.c cVar) {
        C10129a.m18993e(this.controller);
        this.controller.setOnFullScreenModeChangedListener(cVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        C10129a.m18993e(this.controller);
        this.controllerShowTimeoutMs = i10;
        if (this.controller.m7438i()) {
            showController();
        }
    }

    public void setControllerVisibilityListener(InterfaceC2509b interfaceC2509b) {
        this.controllerVisibilityListener = interfaceC2509b;
        if (interfaceC2509b != null) {
            setControllerVisibilityListener((C2517d.l) null);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(C2517d.l lVar) {
        C10129a.m18993e(this.controller);
        C2517d.l lVar2 = this.legacyControllerVisibilityListener;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            this.controller.f13611d.remove(lVar2);
        }
        this.legacyControllerVisibilityListener = lVar;
        if (lVar != null) {
            C2517d c2517d = this.controller;
            c2517d.getClass();
            c2517d.f13611d.add(lVar);
            setControllerVisibilityListener((InterfaceC2509b) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C10129a.m18992d(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC10139h<? super PlaybackException> interfaceC10139h) {
        if (interfaceC10139h != null) {
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        C10129a.m18993e(this.controller);
        C2517d c2517d = this.controller;
        boolean z10 = false;
        if (jArr == null) {
            c2517d.f13593O0 = new long[0];
            c2517d.f13595P0 = new boolean[0];
        } else {
            c2517d.getClass();
            zArr.getClass();
            if (jArr.length == zArr.length) {
                z10 = true;
            }
            C10129a.m18990b(z10);
            c2517d.f13593O0 = jArr;
            c2517d.f13595P0 = zArr;
        }
        c2517d.m7449t();
    }

    public void setFullscreenButtonClickListener(InterfaceC2510c interfaceC2510c) {
        C10129a.m18993e(this.controller);
        this.controller.setOnFullScreenModeChangedListener(this.componentListener);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.keepContentOnPlayerReset != z10) {
            this.keepContentOnPlayerReset = z10;
            updateForCurrentTrackSelections(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    public void setPlayer(InterfaceC2532v interfaceC2532v) {
        C10129a.m18992d(Looper.myLooper() == Looper.getMainLooper());
        C10129a.m18990b(interfaceC2532v == null || interfaceC2532v.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2532v interfaceC2532v2 = this.player;
        if (interfaceC2532v2 == interfaceC2532v) {
            return;
        }
        if (interfaceC2532v2 != null) {
            interfaceC2532v2.removeListener(this.componentListener);
            if (interfaceC2532v2.isCommandAvailable(27)) {
                View view = this.surfaceView;
                if (view instanceof TextureView) {
                    interfaceC2532v2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC2532v2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = interfaceC2532v;
        if (useController()) {
            this.controller.setPlayer(interfaceC2532v);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (interfaceC2532v == null) {
            hideController();
            return;
        }
        if (interfaceC2532v.isCommandAvailable(27)) {
            View view2 = this.surfaceView;
            if (view2 instanceof TextureView) {
                interfaceC2532v.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC2532v.setVideoSurfaceView((SurfaceView) view2);
            }
            updateAspectRatio();
        }
        if (this.subtitleView != null && interfaceC2532v.isCommandAvailable(28)) {
            this.subtitleView.setCues(interfaceC2532v.getCurrentCues().f37689a);
        }
        interfaceC2532v.addListener(this.componentListener);
        maybeShowController(false);
    }

    public void setRepeatToggleModes(int i10) {
        C10129a.m18993e(this.controller);
        this.controller.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        C10129a.m18993e(this.contentFrame);
        this.contentFrame.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.showBuffering != i10) {
            this.showBuffering = i10;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        C10129a.m18993e(this.controller);
        this.controller.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        C10129a.m18992d((z10 && this.artworkView == null) ? false : true);
        if (this.useArtwork != z10) {
            this.useArtwork = z10;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11 = false;
        C10129a.m18992d((z10 && this.controller == null) ? false : true);
        if (z10 || hasOnClickListeners()) {
            z11 = true;
        }
        setClickable(z11);
        if (this.useController == z10) {
            return;
        }
        this.useController = z10;
        if (useController()) {
            this.controller.setPlayer(this.player);
        } else {
            C2517d c2517d = this.controller;
            if (c2517d != null) {
                c2517d.m7437h();
                this.controller.setPlayer(null);
            }
        }
        updateContentDescription();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }
}
