package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p000.C0193fr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final int f902a;

    /* JADX INFO: renamed from: b */
    public final int f903b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0193fr.f23276t);
        this.f903b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f902a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
