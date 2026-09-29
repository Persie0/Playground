package androidx.viewpager2.adapter;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1219c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FragmentStateAdapter f7727a;

    public RunnableC1219c(FragmentStateAdapter fragmentStateAdapter) {
        this.f7727a = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f7727a;
        fragmentStateAdapter.f7706k = false;
        fragmentStateAdapter.m4671s();
    }
}
