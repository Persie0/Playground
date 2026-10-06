package p000;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: je */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0738je implements ListAdapter, SpinnerAdapter {

    /* JADX INFO: renamed from: a */
    private final SpinnerAdapter f33829a;

    /* JADX INFO: renamed from: b */
    private ListAdapter f33830b;

    public C0738je(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f33829a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f33830b = (ListAdapter) spinnerAdapter;
        }
        if (theme != null) {
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                C0736jc.m12883a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof InterfaceC0848ng) {
                InterfaceC0848ng interfaceC0848ng = (InterfaceC0848ng) spinnerAdapter;
                if (interfaceC0848ng.m17459a() == null) {
                    interfaceC0848ng.m17460b();
                }
            }
        }
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f33830b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f33829a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f33829a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.f33829a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.f33829a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f33829a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f33830b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f33829a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f33829a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
