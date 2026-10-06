package com.google.android.apps.camera.bottombar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import p000.C1178zm;
import p000.C1190zy;
import p000.hze;
import p000.hzj;
import p000.ila;
import p000.ilk;
import p000.inw;
import p000.jfs;
import p000.jvd;
import p000.jvh;
import p000.mqu;
import p000.mrm;
import p000.mwn;
import p000.mws;
import p000.mwt;
import p000.mwx;
import p000.mxk;
import p000.mzw;
import p000.naz;
import p000.nbh;
import p021j$.util.Collection$EL;
import p021j$.util.function.BiConsumer$CC;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BottomBar extends ConstraintLayout implements hze {
    static final String BOTTOM_BAR_CONTENT_TAG = "bottomBarContent";
    private static final float CENTER_BIAS_VALUE = 0.5f;
    private final int backgroundColor;
    private BottomBarLayoutListener bottomBarLayoutListener;
    private ilk bottomBarOrientation;
    private CameraSwitchButton cameraSwitchButton;
    private ImageButton cancelButton;
    private ViewStub cancelButtonStub;
    private FrameLayout centerPlaceholder;
    private final EnumMap currentButtons;
    private hzj decision;
    private final EnumMap disabledButtons;
    private final Set isEnableCombine;
    private boolean isShown;
    private final EnumMap lastChangeList;
    private ImageButton leftSideCancelButton;
    private ViewStub leftSideCancelButtonStub;
    private final EnumMap listenerMap;
    private boolean needUpdateComponentPosition;
    private boolean needsLayoutListenerUpdate;
    private PauseResumeButton pauseResumeButton;
    private ViewStub pauseResumeButtonStub;
    private EnumMap placeholders;
    private ImageButton retakeButton;
    private ViewStub retakeButtonStub;
    private ImageButton reviewPlayButton;
    private ViewStub reviewPlayButtonStub;
    private ShutterButton shutterButton;
    private ShutterButtonProgressOverlay shutterButtonProgressOverlay;
    private EnumMap sideButtonContainers;
    private ViewStub snapShotButtonStub;
    private SnapshotButton snapshotButton;
    private EnumMap spaces;
    private RoundedThumbnailView thumbnailView;
    private ZoomLockView zoomLockView;
    private static final nbh logger = nbh.m17259h("com/google/android/apps/camera/bottombar/BottomBar");
    private static final mxk LEFT_POSITIONS = mxk.m17137I(SideButtonPosition.CENTER_LEFT, SideButtonPosition.LEFT);
    private static final mxk RIGHT_POSITIONS = mxk.m17137I(SideButtonPosition.CENTER_RIGHT, SideButtonPosition.RIGHT);

    /* JADX INFO: compiled from: PG */
    public interface OnContentVisibilityChangedListener {
        void onContentVisibilityChanged(View view, int i);
    }

    /* JADX INFO: compiled from: PG */
    public enum SideButtonPosition {
        LEFT,
        CENTER_LEFT,
        CENTER_RIGHT,
        RIGHT
    }

    public BottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.listenerMap = new EnumMap(SideButtonPosition.class);
        this.disabledButtons = new EnumMap(SideButtonPosition.class);
        this.lastChangeList = new EnumMap(SideButtonPosition.class);
        SideButtonPosition sideButtonPosition = SideButtonPosition.LEFT;
        mqu mquVar = mqu.f41450a;
        this.currentButtons = new EnumMap(mwx.m17122q(sideButtonPosition, mquVar, SideButtonPosition.CENTER_LEFT, mquVar, SideButtonPosition.CENTER_RIGHT, mquVar, SideButtonPosition.RIGHT, mquVar));
        this.isEnableCombine = new HashSet();
        this.bottomBarOrientation = ilk.PORTRAIT;
        this.decision = hzj.PHONE_LAYOUT;
        this.isShown = false;
        this.needUpdateComponentPosition = false;
        this.needsLayoutListenerUpdate = false;
        this.backgroundColor = context.getColor(C0100R.color.bottom_bar_background_color);
        inflate(context);
    }

    private void adjustPadding() {
        final Resources resources = getResources();
        int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
        final int dimensionPixelOffset = resources.getDimensionPixelOffset(C0100R.dimen.bottom_bar_content_size);
        if (dimensionPixelOffset > iMin) {
            final C1190zy c1190zy = new C1190zy();
            c1190zy.m19820e(this);
            Collection$EL.forEach(jvh.m13570r(this), new Consumer() { // from class: com.google.android.apps.camera.bottombar.BottomBar$$ExternalSyntheticLambda4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BottomBar.lambda$adjustPadding$0(dimensionPixelOffset, c1190zy, resources, (View) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            c1190zy.m19818c(this);
        }
        applyOrientation();
    }

    private void applyOrientation() {
        Trace.beginSection("bottomBar:applyOrientation");
        jvh.m13577y(this, this.bottomBarOrientation);
        rotateChildComponents(jvh.m13570r(this));
        Trace.endSection();
    }

    private void broadcastContentVisibilityChanged(SideButtonPosition sideButtonPosition, mrm mrmVar) {
        mrm mrmVar2 = (mrm) this.currentButtons.get(sideButtonPosition);
        mrmVar2.getClass();
        if (mrmVar.equals(mrmVar2)) {
            if (!mrmVar2.mo16813g()) {
                FrameLayout frameLayout = (FrameLayout) this.placeholders.get(sideButtonPosition);
                frameLayout.getClass();
                if (frameLayout.getVisibility() == 8) {
                    return;
                }
            }
            if (mrmVar2.mo16813g()) {
                FrameLayout frameLayout2 = (FrameLayout) this.placeholders.get(sideButtonPosition);
                frameLayout2.getClass();
                if (frameLayout2.getVisibility() == 0 && ((View) mrmVar2.mo16809c()).getVisibility() == 0) {
                    return;
                }
            }
        }
        if (this.listenerMap.containsKey(sideButtonPosition)) {
            List<OnContentVisibilityChangedListener> list = (List) this.listenerMap.get(sideButtonPosition);
            list.getClass();
            for (OnContentVisibilityChangedListener onContentVisibilityChangedListener : list) {
                if (mrmVar2.mo16813g()) {
                    onContentVisibilityChangedListener.onContentVisibilityChanged((View) mrmVar2.mo16809c(), 8);
                }
                if (mrmVar.mo16813g()) {
                    onContentVisibilityChangedListener.onContentVisibilityChanged((View) mrmVar.mo16809c(), 0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void broadcastSideButtonCombineListener(SideButtonPosition sideButtonPosition, SideButtonCombineListener sideButtonCombineListener) {
        if (this.isEnableCombine.contains(sideButtonPosition)) {
            sideButtonCombineListener.onCouple();
        } else {
            sideButtonCombineListener.onDecouple();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: changeSideButtons, reason: merged with bridge method [inline-methods] */
    public void m4043xa9ee5eba(SideButtonPosition sideButtonPosition, mrm mrmVar, boolean z) {
        mrm mrmVar2 = (mrm) this.currentButtons.get(sideButtonPosition);
        mrmVar2.getClass();
        broadcastContentVisibilityChanged(sideButtonPosition, mrmVar);
        setPlaceholderVisibility(sideButtonPosition, true != mrmVar.mo16813g() ? 8 : 0);
        if (mrmVar.mo16813g()) {
            KeyEvent.Callback callback = (View) mrmVar.mo16809c();
            if (callback instanceof SideButtonCombineListener) {
                broadcastSideButtonCombineListener(sideButtonPosition, (SideButtonCombineListener) callback);
            }
        }
        showButtonTransitionAnimation(mrmVar, mrmVar2, z);
        this.currentButtons.put(sideButtonPosition, mrmVar);
    }

    private static void fadeView(View view, boolean z, boolean z2) {
        jvd.m13538a();
        if (z2) {
            inw.m11549a(true == z ? 0 : 8, view);
            return;
        }
        view.setVisibility(true == z ? 0 : 8);
        view.setClickable(z);
        view.setAlpha(true != z ? 0.0f : 1.0f);
    }

    private mws getComponentViews() {
        mwn mwnVar = new mwn();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Object tag = childAt.getTag();
            if (tag != null && tag.equals(BOTTOM_BAR_CONTENT_TAG) && childAt.getVisibility() != 8) {
                mwnVar.m17082g(getChildAt(i));
            }
        }
        return mwnVar.m17081f();
    }

    private int getMeasuredPlaceholdersWidth(mxk mxkVar) {
        naz nazVarListIterator = mxkVar.listIterator();
        int measuredWidth = 0;
        while (nazVarListIterator.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) this.placeholders.get((SideButtonPosition) nazVarListIterator.next());
            frameLayout.getClass();
            if (frameLayout.getVisibility() != 8) {
                measuredWidth += frameLayout.getMeasuredWidth();
            }
        }
        return measuredWidth;
    }

    private int getMeasuredSpaceWidth(mxk mxkVar) {
        naz nazVarListIterator = mxkVar.listIterator();
        int i = 0;
        while (nazVarListIterator.hasNext()) {
            SideButtonPosition sideButtonPosition = (SideButtonPosition) nazVarListIterator.next();
            if (this.spaces.containsKey(sideButtonPosition)) {
                Space space = (Space) this.spaces.get(sideButtonPosition);
                space.getClass();
                C1178zm c1178zm = (C1178zm) space.getLayoutParams();
                if (space.getVisibility() != 8 && c1178zm != null) {
                    i += c1178zm.width;
                }
            }
        }
        return i;
    }

    private int getViewId(mws mwsVar, int i) {
        if (i < 0 || i >= mwsVar.size()) {
            return 0;
        }
        return ((View) mwsVar.get(i)).getId();
    }

    private void inflate(Context context) {
        jfs jfsVarM13066o = jfs.m13066o(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0100R.layout.bottom_bar_layout, this));
        this.shutterButton = (ShutterButton) jfsVarM13066o.m13100f(C0100R.id.shutter_button);
        this.shutterButtonProgressOverlay = (ShutterButtonProgressOverlay) jfsVarM13066o.m13100f(C0100R.id.shutter_progress_overlay);
        this.zoomLockView = (ZoomLockView) jfsVarM13066o.m13100f(C0100R.id.zoom_lock_view);
        this.pauseResumeButtonStub = (ViewStub) jfsVarM13066o.m13100f(C0100R.id.pause_resume_button_view_stub);
        this.cameraSwitchButton = (CameraSwitchButton) jfsVarM13066o.m13100f(C0100R.id.camera_switch_button);
        this.snapShotButtonStub = (ViewStub) jfsVarM13066o.m13100f(C0100R.id.snapshot_button_stub);
        this.thumbnailView = (RoundedThumbnailView) jfsVarM13066o.m13100f(C0100R.id.thumbnail_button);
        this.cancelButtonStub = (ViewStub) jfsVarM13066o.m13100f(C0100R.id.cancel_button_stub);
        this.leftSideCancelButtonStub = (ViewStub) jfsVarM13066o.m13100f(C0100R.id.left_side_cancel_button_view_stub);
        this.retakeButtonStub = (ViewStub) jfsVarM13066o.m13100f(C0100R.id.retake_button_view_stub);
        this.reviewPlayButtonStub = (ViewStub) jfsVarM13066o.m13100f(C0100R.id.review_play_button_view_stub);
        this.centerPlaceholder = (FrameLayout) jfsVarM13066o.m13100f(C0100R.id.center_placeholder);
        this.placeholders = new EnumMap(mwx.m17122q(SideButtonPosition.LEFT, (FrameLayout) jfsVarM13066o.m13100f(C0100R.id.left_placeholder), SideButtonPosition.CENTER_LEFT, (FrameLayout) jfsVarM13066o.m13100f(C0100R.id.center_left_placeholder), SideButtonPosition.CENTER_RIGHT, (FrameLayout) jfsVarM13066o.m13100f(C0100R.id.center_right_placeholder), SideButtonPosition.RIGHT, (FrameLayout) jfsVarM13066o.m13100f(C0100R.id.right_placeholder)));
        this.spaces = new EnumMap(mwx.m17120o(SideButtonPosition.LEFT, (Space) jfsVarM13066o.m13100f(C0100R.id.left_space), SideButtonPosition.RIGHT, (Space) jfsVarM13066o.m13100f(C0100R.id.right_space)));
        this.sideButtonContainers = new EnumMap(mwx.m17120o(SideButtonPosition.LEFT, (SideButtonContainer) jfsVarM13066o.m13100f(C0100R.id.left_placeholder_container), SideButtonPosition.RIGHT, (SideButtonContainer) jfsVarM13066o.m13100f(C0100R.id.right_placeholder_container)));
    }

    static /* synthetic */ void lambda$adjustPadding$0(int i, C1190zy c1190zy, Resources resources, View view) {
        if (view.getMeasuredHeight() > i) {
            c1190zy.m19824i(view.getId(), resources.getDimensionPixelOffset(C0100R.dimen.bottom_bar_content_size_small));
        }
    }

    private void rotateChildComponents(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof SideButtonContainer) {
                rotateChildComponents(jvh.m13570r((ViewGroup) view));
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    view.setPivotX(layoutParams.width / 2.0f);
                    view.setPivotY(layoutParams.height / 2.0f);
                    jvh.m13578z(view, this.bottomBarOrientation);
                }
            }
        }
    }

    private void setPlaceholderVisibility(SideButtonPosition sideButtonPosition, int i) {
        FrameLayout frameLayout = (FrameLayout) this.placeholders.get(sideButtonPosition);
        frameLayout.getClass();
        frameLayout.setVisibility(i);
        this.needUpdateComponentPosition = true;
    }

    private void showButtonTransitionAnimation(mrm mrmVar, mrm mrmVar2, boolean z) {
        if (mrmVar2.mo16813g()) {
            fadeView((View) mrmVar2.mo16809c(), false, z);
        }
        if (mrmVar.mo16813g()) {
            fadeView((View) mrmVar.mo16809c(), true, z);
        }
    }

    private void updateBottomBarComponents() {
        mws componentViews = getComponentViews();
        updateComponentsConnection(componentViews);
        updateSpaceComponentsSize();
        updateHorizontalChainStyle(componentViews);
    }

    private void updateCombineStatus(final Map map) {
        this.isEnableCombine.clear();
        Set set = this.isEnableCombine;
        mxk mxkVar = LEFT_POSITIONS;
        set.addAll(mxkVar);
        Collection$EL.forEach(mxkVar, new Consumer() { // from class: com.google.android.apps.camera.bottombar.BottomBar$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.m4044xd35f5fb(map, (BottomBar.SideButtonPosition) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Set set2 = this.isEnableCombine;
        mxk mxkVar2 = RIGHT_POSITIONS;
        set2.addAll(mxkVar2);
        Collection$EL.forEach(mxkVar2, new Consumer() { // from class: com.google.android.apps.camera.bottombar.BottomBar$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.m4045x3b0e905a(map, (BottomBar.SideButtonPosition) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private void updateComponentsConnection(mws mwsVar) {
        C1190zy c1190zy = new C1190zy();
        c1190zy.m19820e(this);
        if (mwsVar.size() > 1) {
            for (int i = 0; i < mwsVar.size(); i++) {
                int viewId = getViewId(mwsVar, i);
                c1190zy.m19822g(viewId, 3, 0, 3);
                c1190zy.m19822g(viewId, 4, 0, 4);
                if (i == 0) {
                    c1190zy.m19822g(viewId, 1, 0, 1);
                    c1190zy.m19822g(viewId, 2, getViewId(mwsVar, 1), 1);
                } else if (i == mwsVar.size() - 1) {
                    c1190zy.m19822g(viewId, 1, getViewId(mwsVar, i - 1), 2);
                    c1190zy.m19822g(viewId, 2, 0, 2);
                } else {
                    c1190zy.m19822g(viewId, 1, getViewId(mwsVar, i - 1), 2);
                    c1190zy.m19822g(viewId, 2, getViewId(mwsVar, i + 1), 1);
                }
            }
        } else {
            int viewId2 = getViewId(mwsVar, 0);
            c1190zy.m19822g(viewId2, 3, 0, 3);
            c1190zy.m19822g(viewId2, 4, 0, 4);
            c1190zy.m19822g(viewId2, 1, 0, 1);
            c1190zy.m19822g(viewId2, 2, 0, 2);
        }
        c1190zy.m19818c(this);
    }

    private void updateHorizontalChainStyle(mws mwsVar) {
        float f;
        int measuredWidth = getMeasuredWidth() / 2;
        mxk mxkVar = LEFT_POSITIONS;
        int iMax = Math.max(((measuredWidth - getMeasuredPlaceholdersWidth(mxkVar)) - getMeasuredSpaceWidth(mxkVar)) - (this.centerPlaceholder.getMeasuredWidth() / 2), 0);
        mxk mxkVar2 = RIGHT_POSITIONS;
        int iMax2 = Math.max(((measuredWidth - getMeasuredPlaceholdersWidth(mxkVar2)) - getMeasuredSpaceWidth(mxkVar2)) - (this.centerPlaceholder.getMeasuredWidth() / 2), 0);
        if (iMax != 0) {
            f = iMax / (iMax2 + iMax);
        } else if (iMax2 != 0) {
            iMax = 0;
            f = iMax / (iMax2 + iMax);
        } else {
            f = CENTER_BIAS_VALUE;
        }
        C1190zy c1190zy = new C1190zy();
        c1190zy.m19820e(this);
        c1190zy.m19817b(getViewId(mwsVar, 0)).f48481d.f48509X = 2;
        c1190zy.m19831r(getViewId(mwsVar, 0), f);
        c1190zy.m19818c(this);
    }

    private void updateSpaceComponentsSize() {
        int measuredWidth = getMeasuredWidth() / 2;
        int iMax = Math.max((measuredWidth - getMeasuredPlaceholdersWidth(LEFT_POSITIONS)) - (this.centerPlaceholder.getMeasuredWidth() / 2), 1);
        int iMax2 = Math.max((measuredWidth - getMeasuredPlaceholdersWidth(RIGHT_POSITIONS)) - (this.centerPlaceholder.getMeasuredWidth() / 2), 1);
        C1190zy c1190zy = new C1190zy();
        c1190zy.m19820e(this);
        for (Map.Entry entry : this.spaces.entrySet()) {
            if (((Space) entry.getValue()).getVisibility() != 8) {
                if (LEFT_POSITIONS.contains(entry.getKey())) {
                    c1190zy.m19825j(((Space) entry.getValue()).getId(), Math.min(iMax / 2, getResources().getDimensionPixelSize(C0100R.dimen.bottom_bar_space_gap_width)));
                } else {
                    c1190zy.m19825j(((Space) entry.getValue()).getId(), Math.min(iMax2 / 2, getResources().getDimensionPixelSize(C0100R.dimen.bottom_bar_space_gap_width)));
                }
            }
        }
        c1190zy.m19818c(this);
    }

    public void addOnContentVisibilityChangedListener(SideButtonPosition sideButtonPosition, OnContentVisibilityChangedListener onContentVisibilityChangedListener) {
        List arrayList;
        if (this.listenerMap.containsKey(sideButtonPosition)) {
            arrayList = (List) this.listenerMap.get(sideButtonPosition);
            arrayList.getClass();
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(onContentVisibilityChangedListener);
        this.listenerMap.put(sideButtonPosition, arrayList);
    }

    public void addView(SideButtonPosition sideButtonPosition, View view) {
        FrameLayout frameLayout = (FrameLayout) this.placeholders.get(sideButtonPosition);
        frameLayout.getClass();
        frameLayout.addView(view);
    }

    public void changeMultipleSideButtons(mwx mwxVar, final boolean z) {
        jvd.m13538a();
        this.lastChangeList.clear();
        EnumMap enumMap = new EnumMap(SideButtonPosition.class);
        for (SideButtonPosition sideButtonPosition : SideButtonPosition.values()) {
            mrm mrmVar = mqu.f41450a;
            if (mwxVar.containsKey(sideButtonPosition)) {
                mrmVar = (mrm) mwxVar.get(sideButtonPosition);
                mrmVar.getClass();
                if (mrmVar.mo16813g()) {
                    this.lastChangeList.put(sideButtonPosition, (View) mrmVar.mo16809c());
                }
                if (this.disabledButtons.containsKey(sideButtonPosition) && mrmVar.mo16813g() && ((View) mrmVar.mo16809c()).equals(this.disabledButtons.get(sideButtonPosition))) {
                    mrmVar = mqu.f41450a;
                }
            }
            enumMap.put(sideButtonPosition, mrmVar);
        }
        updateCombineStatus(enumMap);
        p021j$.util.Map.EL.forEach(this.sideButtonContainers, new BiConsumer() { // from class: com.google.android.apps.camera.bottombar.BottomBar$$ExternalSyntheticLambda2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f$0.broadcastSideButtonCombineListener((BottomBar.SideButtonPosition) obj, (SideButtonContainer) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        p021j$.util.Map.EL.forEach(enumMap, new BiConsumer() { // from class: com.google.android.apps.camera.bottombar.BottomBar$$ExternalSyntheticLambda3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f$0.m4043xa9ee5eba(z, (BottomBar.SideButtonPosition) obj, (mrm) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public void clearSideButtons(boolean z) {
        jvd.m13538a();
        changeMultipleSideButtons(mzw.f41870a, z);
    }

    public void disableSideButtons(SideButtonPosition sideButtonPosition, mrm mrmVar) {
        jvd.m13538a();
        if (mrmVar.mo16813g()) {
            this.disabledButtons.put(sideButtonPosition, (View) mrmVar.mo16809c());
        } else {
            this.disabledButtons.remove(sideButtonPosition);
        }
        mwt mwtVarM17115i = mwx.m17115i();
        for (Map.Entry entry : this.lastChangeList.entrySet()) {
            mwtVarM17115i.mo17110e((SideButtonPosition) entry.getKey(), mrm.m16829i((View) entry.getValue()));
        }
        changeMultipleSideButtons(mwtVarM17115i.m17109d(), true);
    }

    public void fadeBackground(boolean z, boolean z2) {
        jvd.m13538a();
        if (this.isShown == z) {
            return;
        }
        this.isShown = z;
        if (!z2) {
            getBackground().setAlpha(true == z ? 255 : 0);
            return;
        }
        String str = rgoX.HRQxEvQaexKoW;
        ObjectAnimator objectAnimatorOfInt = z ? ObjectAnimator.ofInt(getBackground(), str, 0, 255) : ObjectAnimator.ofInt(getBackground(), str, 255, 0);
        objectAnimatorOfInt.setDuration(getResources().getInteger(C0100R.integer.bottom_bar_recording_fade_duration_ms));
        objectAnimatorOfInt.setStartDelay(getResources().getInteger(C0100R.integer.bottom_bar_recording_fade_delay_ms));
        objectAnimatorOfInt.start();
    }

    public ila getBackgroundColorProperty() {
        return new ila() { // from class: com.google.android.apps.camera.bottombar.BottomBar.1
            public int getColor() {
                return ((ColorDrawable) BottomBar.this.getBackground()).getColor();
            }

            @Override // p000.ila
            public void setColor(int i) {
                BottomBar.this.setBackgroundColor(i);
            }
        };
    }

    public CameraSwitchButton getCameraSwitchButton() {
        return this.cameraSwitchButton;
    }

    public ImageButton getCancelButton() {
        if (this.cancelButton == null) {
            jvd.m13538a();
            this.cancelButton = (ImageButton) this.cancelButtonStub.inflate();
        }
        return this.cancelButton;
    }

    public ImageButton getLeftSideCancelButton() {
        if (this.leftSideCancelButton == null) {
            jvd.m13538a();
            this.leftSideCancelButton = (ImageButton) this.leftSideCancelButtonStub.inflate();
        }
        return this.leftSideCancelButton;
    }

    EnumMap getListenerMap() {
        return this.listenerMap;
    }

    public PauseResumeButton getPauseResumeButton() {
        if (this.pauseResumeButton == null) {
            jvd.m13538a();
            this.pauseResumeButton = (PauseResumeButton) this.pauseResumeButtonStub.inflate();
        }
        return this.pauseResumeButton;
    }

    EnumMap getPlaceholders() {
        return this.placeholders;
    }

    public ImageButton getRetakeButton() {
        if (this.retakeButton == null) {
            jvd.m13538a();
            this.retakeButton = (ImageButton) this.retakeButtonStub.inflate();
        }
        return this.retakeButton;
    }

    public ImageButton getReviewPlayButton() {
        if (this.reviewPlayButton == null) {
            jvd.m13538a();
            this.reviewPlayButton = (ImageButton) this.reviewPlayButtonStub.inflate();
        }
        return this.reviewPlayButton;
    }

    public ShutterButton getShutterButton() {
        return this.shutterButton;
    }

    public ShutterButtonProgressOverlay getShutterButtonProgressOverlay() {
        return this.shutterButtonProgressOverlay;
    }

    EnumMap getSideButtonContainers() {
        return this.sideButtonContainers;
    }

    public SnapshotButton getSnapshotButton() {
        if (this.snapshotButton == null) {
            jvd.m13538a();
            this.snapshotButton = (SnapshotButton) this.snapShotButtonStub.inflate();
        }
        return this.snapshotButton;
    }

    EnumMap getSpaces() {
        return this.spaces;
    }

    public RoundedThumbnailView getThumbnailButton() {
        return this.thumbnailView;
    }

    public ilk getUiOrientation() {
        return this.bottomBarOrientation;
    }

    public ZoomLockView getZoomLockView() {
        return this.zoomLockView;
    }

    /* JADX INFO: renamed from: lambda$updateCombineStatus$2$com-google-android-apps-camera-bottombar-BottomBar */
    public /* synthetic */ void m4044xd35f5fb(Map map, SideButtonPosition sideButtonPosition) {
        if (map.containsKey(sideButtonPosition)) {
            if (!map.containsKey(sideButtonPosition)) {
                return;
            }
            mrm mrmVar = (mrm) map.get(sideButtonPosition);
            mrmVar.getClass();
            if (mrmVar.mo16813g()) {
                return;
            }
        }
        this.isEnableCombine.removeAll(LEFT_POSITIONS);
    }

    /* JADX INFO: renamed from: lambda$updateCombineStatus$3$com-google-android-apps-camera-bottombar-BottomBar */
    public /* synthetic */ void m4045x3b0e905a(Map map, SideButtonPosition sideButtonPosition) {
        if (map.containsKey(sideButtonPosition)) {
            if (!map.containsKey(sideButtonPosition)) {
                return;
            }
            mrm mrmVar = (mrm) map.get(sideButtonPosition);
            mrmVar.getClass();
            if (mrmVar.mo16813g()) {
                return;
            }
        }
        this.isEnableCombine.removeAll(RIGHT_POSITIONS);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundColor(0);
        setBackgroundColor(this.backgroundColor);
        this.currentButtons.put(SideButtonPosition.CENTER_LEFT, mrm.m16829i(getCameraSwitchButton()));
        this.currentButtons.put(SideButtonPosition.CENTER_RIGHT, mrm.m16829i(getThumbnailButton()));
        this.isShown = getBackground().getAlpha() != 0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("bottomBar:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.needUpdateComponentPosition) {
            updateBottomBarComponents();
            applyOrientation();
            this.needUpdateComponentPosition = false;
            if (this.needsLayoutListenerUpdate) {
                BottomBarLayoutListener bottomBarLayoutListener = this.bottomBarLayoutListener;
                if (bottomBarLayoutListener != null) {
                    bottomBarLayoutListener.onBottomBarLayoutChange();
                }
                this.needsLayoutListenerUpdate = false;
            }
        }
        Trace.endSection();
    }

    @Override // p000.hze
    public void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
        if (this.bottomBarOrientation == ilkVar && this.decision == hzjVar) {
            return;
        }
        this.needUpdateComponentPosition = true;
        this.bottomBarOrientation = ilkVar;
        this.decision = hzjVar;
        updateBottomBarComponents();
        this.needsLayoutListenerUpdate = true;
        applyOrientation();
    }

    @Override // p000.hze
    public /* synthetic */ void onLayoutUpdated(ilk ilkVar) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        adjustPadding();
    }

    public void removeOnContentVisibilityChangedListener(OnContentVisibilityChangedListener onContentVisibilityChangedListener) {
        Iterator it = this.listenerMap.entrySet().iterator();
        while (it.hasNext() && !((List) ((Map.Entry) it.next()).getValue()).remove(onContentVisibilityChangedListener)) {
        }
    }

    public void replaceSideButton(SideButtonPosition sideButtonPosition, mrm mrmVar, boolean z) {
        jvd.m13538a();
        mwt mwtVarM17115i = mwx.m17115i();
        for (Map.Entry entry : this.lastChangeList.entrySet()) {
            mwtVarM17115i.mo17110e((SideButtonPosition) entry.getKey(), mrm.m16829i((View) entry.getValue()));
        }
        mwtVarM17115i.mo17110e(sideButtonPosition, mrmVar);
        changeMultipleSideButtons(mwtVarM17115i.m17109d(), z);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        setSideButtonsClickable(z);
    }

    public void setLayoutListener(BottomBarLayoutListener bottomBarLayoutListener) {
        this.bottomBarLayoutListener = bottomBarLayoutListener;
    }

    public void setSideButtonsClickable(boolean z) {
        Iterator it = this.currentButtons.entrySet().iterator();
        while (it.hasNext()) {
            mrm mrmVar = (mrm) ((Map.Entry) it.next()).getValue();
            if (mrmVar.mo16813g()) {
                ((View) mrmVar.mo16809c()).setClickable(z);
            }
        }
    }
}
