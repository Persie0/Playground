package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import androidx.appcompat.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final int f1015a;

    /* JADX INFO: renamed from: b */
    public final int f1016b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecycleListView);
        this.f1016b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
        this.f1015a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
