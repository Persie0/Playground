package com.google.android.clockwork.common.wearable.wearmaterial.time;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.widget.CurvedTextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Calendar;
import p000.iyx;
import p000.ize;
import p000.jbx;
import p000.jwl;
import p000.kbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearTimeText extends FrameLayout {

    /* JADX INFO: renamed from: a */
    jwl f7548a;

    /* JADX INFO: renamed from: b */
    kbh f7549b;

    /* JADX INFO: renamed from: c */
    AmbientMode.AmbientController f7550c;

    /* JADX INFO: renamed from: d */
    AmbientMode.AmbientController f7551d;

    /* JADX INFO: renamed from: e */
    private final ize f7552e;

    /* JADX INFO: renamed from: f */
    private final ize f7553f;

    public WearTimeText(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m4631a() {
        DateFormat.is24HourFormat(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4631a();
        jwl jwlVar = this.f7548a;
        Context context = getContext();
        if (!jwlVar.f34954a) {
            context.registerReceiver((BroadcastReceiver) jwlVar.f34956c, (IntentFilter) jwlVar.f34955b);
            jwlVar.f34954a = true;
        }
        kbh kbhVar = new kbh(getHandler(), this.f7551d, null, null, null, null, null);
        this.f7549b = kbhVar;
        Context context2 = getContext();
        if (kbhVar.f35524a) {
            return;
        }
        context2.getContentResolver().registerContentObserver(Settings.System.getUriFor("time_12_24"), true, (ContentObserver) kbhVar.f35525b);
        kbhVar.f35524a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jwl jwlVar = this.f7548a;
        Context context = getContext();
        if (jwlVar.f34954a) {
            context.unregisterReceiver((BroadcastReceiver) jwlVar.f34956c);
            jwlVar.f34954a = false;
        }
        kbh kbhVar = this.f7549b;
        if (kbhVar != null) {
            Context context2 = getContext();
            if (kbhVar.f35524a) {
                context2.getContentResolver().unregisterContentObserver((ContentObserver) kbhVar.f35525b);
                kbhVar.f35524a = false;
            }
            this.f7549b = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotY(getPaddingTop() + getResources().getDimensionPixelSize(C0100R.dimen.wear_time_text_size));
        setPivotX(getMeasuredWidth() / 2.0f);
    }

    public WearTimeText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WearTimeText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context.getResources().getConfiguration().isScreenRound()) {
            LayoutInflater.from(context).inflate(C0100R.layout.curved_time_text, (ViewGroup) this, true);
            jbx.m12863h((CurvedTextView) findViewById(C0100R.id.wear_time_text_clock));
            this.f7552e = jbx.m12863h((CurvedTextView) findViewById(C0100R.id.wear_time_text_divider));
            this.f7553f = jbx.m12863h((CurvedTextView) findViewById(C0100R.id.wear_time_text_title));
        } else {
            LayoutInflater.from(context).inflate(C0100R.layout.straight_time_text, (ViewGroup) this, true);
            jbx.m12863h((TextView) findViewById(C0100R.id.wear_time_text_clock));
            this.f7552e = jbx.m12863h((TextView) findViewById(C0100R.id.wear_time_text_divider));
            this.f7553f = jbx.m12863h((TextView) findViewById(C0100R.id.wear_time_text_title));
        }
        this.f7552e.mo11913b("·");
        getResources().getDimensionPixelSize(C0100R.dimen.wear_time_max_fade_out_scroll);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iyx.f32693a, i, i);
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        this.f7553f.mo11914c(color);
        this.f7552e.mo11914c(color);
        String string = typedArrayObtainStyledAttributes.getString(1);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        this.f7553f.mo11913b(string);
        View viewMo11912a = this.f7553f.mo11912a();
        int i2 = true == zIsEmpty ? 8 : 0;
        viewMo11912a.setVisibility(i2);
        this.f7552e.mo11912a().setVisibility(i2);
        typedArrayObtainStyledAttributes.recycle();
        Calendar.getInstance();
        this.f7550c = new AmbientMode.AmbientController(this);
        this.f7548a = new jwl(this.f7550c, null, null, null, null);
        this.f7551d = new AmbientMode.AmbientController(this, (byte[]) null);
    }
}
