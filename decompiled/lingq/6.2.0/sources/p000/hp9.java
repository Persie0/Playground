package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hp9 extends View {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f42745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jp9 f42746b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp9(jp9 jp9Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.f42746b = jp9Var;
        this.f42745a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        jp9 jp9Var = this.f42746b;
        ArrayList arrayList = jp9Var.f45973b;
        Drawable background = this.f42745a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (jp9Var.f45976e != color) {
            jp9Var.f45976e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((yn7) arrayList.get(size)).m25213b(color);
            }
        }
    }
}
