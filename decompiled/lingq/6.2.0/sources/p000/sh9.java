package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sh9 {

    /* JADX INFO: renamed from: a */
    public final int f60868a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f60869b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f60870c;

    public sh9(Context context, XmlResourceParser xmlResourceParser) {
        this.f60870c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.State_android_id) {
                this.f60868a = typedArrayObtainStyledAttributes.getResourceId(index, this.f60868a);
            } else if (index == R$styleable.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f60870c);
                this.f60870c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
