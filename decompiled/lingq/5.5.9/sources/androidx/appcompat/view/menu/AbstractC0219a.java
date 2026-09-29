package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import com.linguist.R;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0219a implements InterfaceC0228j {

    /* JADX INFO: renamed from: a */
    public final Context f633a;

    /* JADX INFO: renamed from: b */
    public Context f634b;

    /* JADX INFO: renamed from: c */
    public C0224f f635c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f636d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0228j.a f637e;

    /* JADX INFO: renamed from: f */
    public final int f638f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g */
    public final int f639g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: h */
    public InterfaceC0229k f640h;

    /* JADX INFO: renamed from: i */
    public int f641i;

    public AbstractC0219a(Context context) {
        this.f633a = context;
        this.f636d = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: f */
    public final void mo890f(InterfaceC0228j.a aVar) {
        this.f637e = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: g */
    public final boolean mo891g(C0226h c0226h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    public final int getId() {
        return this.f641i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: m */
    public final boolean mo892m(C0226h c0226h) {
        return false;
    }
}
