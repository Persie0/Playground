package p000;

import android.support.v7.widget.RecyclerView;
import android.widget.EdgeEffect;
import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwv extends C0159ek {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FadingWearableRecyclerView f32511a;

    public iwv(FadingWearableRecyclerView fadingWearableRecyclerView) {
        this.f32511a = fadingWearableRecyclerView;
    }

    @Override // p000.C0159ek
    /* JADX INFO: renamed from: c */
    public final EdgeEffect mo7407c(RecyclerView recyclerView) {
        return new iwy(recyclerView.getContext(), this.f32511a);
    }
}
