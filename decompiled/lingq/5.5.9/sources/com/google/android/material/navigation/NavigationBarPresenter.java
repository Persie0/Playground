package com.google.android.material.navigation;

import ad.AbstractC0057a;
import ad.AbstractC0060d;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.view.menu.SubMenuC0231m;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.C2947a;
import com.google.android.material.internal.ParcelableSparseArray;
import p406u4.C9400b;
import p406u4.C9419k0;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationBarPresenter implements InterfaceC0228j {

    /* JADX INFO: renamed from: a */
    public AbstractC0060d f15416a;

    /* JADX INFO: renamed from: b */
    public boolean f15417b = false;

    /* JADX INFO: renamed from: c */
    public int f15418c;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3041a();

        /* JADX INFO: renamed from: a */
        public int f15419a;

        /* JADX INFO: renamed from: b */
        public ParcelableSparseArray f15420b;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        public class C3041a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f15419a = parcel.readInt();
            this.f15420b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f15419a);
            parcel.writeParcelable(this.f15420b, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: c */
    public final void mo895c(C0224f c0224f, boolean z10) {
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: d */
    public final void mo896d(boolean z10) {
        boolean z11;
        C9400b c9400b;
        if (this.f15417b) {
            return;
        }
        if (z10) {
            this.f15416a.m236a();
            return;
        }
        AbstractC0060d abstractC0060d = this.f15416a;
        C0224f c0224f = abstractC0060d.f130a0;
        if (c0224f != null) {
            if (abstractC0060d.f135f == null) {
                return;
            }
            int size = c0224f.size();
            if (size != abstractC0060d.f135f.length) {
                abstractC0060d.m236a();
                return;
            }
            int i10 = abstractC0060d.f136g;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = abstractC0060d.f130a0.getItem(i11);
                if (item.isChecked()) {
                    abstractC0060d.f136g = item.getItemId();
                    abstractC0060d.f137h = i11;
                }
            }
            if (i10 != abstractC0060d.f136g && (c9400b = abstractC0060d.f129a) != null) {
                C9419k0.m17819a(abstractC0060d, c9400b);
            }
            int i12 = abstractC0060d.f134e;
            int size2 = abstractC0060d.f130a0.m928l().size();
            if (i12 == -1) {
                if (size2 > 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < size; i13++) {
                abstractC0060d.f128W.f15417b = true;
                abstractC0060d.f135f[i13].setLabelVisibilityMode(abstractC0060d.f134e);
                abstractC0060d.f135f[i13].setShifting(z11);
                abstractC0060d.f135f[i13].mo232d((C0226h) abstractC0060d.f130a0.getItem(i13));
                abstractC0060d.f128W.f15417b = false;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: e */
    public final boolean mo897e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: g */
    public final boolean mo891g(C0226h c0226h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    public final int getId() {
        return this.f15418c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: h */
    public final void mo913h(Context context, C0224f c0224f) {
        this.f15416a.f130a0 = c0224f;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: i */
    public final void mo898i(Parcelable parcelable) {
        SparseArray<C2947a> sparseArray;
        if (parcelable instanceof SavedState) {
            AbstractC0060d abstractC0060d = this.f15416a;
            SavedState savedState = (SavedState) parcelable;
            int i10 = savedState.f15419a;
            int size = abstractC0060d.f130a0.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = abstractC0060d.f130a0.getItem(i11);
                if (i10 == item.getItemId()) {
                    abstractC0060d.f136g = i10;
                    abstractC0060d.f137h = i11;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f15416a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f15420b;
            SparseArray sparseArray2 = new SparseArray(parcelableSparseArray.size());
            for (int i12 = 0; i12 < parcelableSparseArray.size(); i12++) {
                int iKeyAt = parcelableSparseArray.keyAt(i12);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i12);
                if (state == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                sparseArray2.put(iKeyAt, new C2947a(context, state));
            }
            AbstractC0060d abstractC0060d2 = this.f15416a;
            abstractC0060d2.getClass();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = abstractC0060d2.f118M;
                if (i13 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i13);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (C2947a) sparseArray2.get(iKeyAt2));
                }
                i13++;
            }
            AbstractC0057a[] abstractC0057aArr = abstractC0060d2.f135f;
            if (abstractC0057aArr != null) {
                for (AbstractC0057a abstractC0057a : abstractC0057aArr) {
                    abstractC0057a.setBadge(sparseArray.get(abstractC0057a.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: k */
    public final boolean mo900k(SubMenuC0231m subMenuC0231m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: l */
    public final Parcelable mo901l() {
        SavedState savedState = new SavedState();
        savedState.f15419a = this.f15416a.getSelectedItemId();
        SparseArray<C2947a> badgeDrawables = this.f15416a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int iKeyAt = badgeDrawables.keyAt(i10);
            C2947a c2947aValueAt = badgeDrawables.valueAt(i10);
            if (c2947aValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, c2947aValueAt.f14760e.f14720a);
        }
        savedState.f15420b = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: m */
    public final boolean mo892m(C0226h c0226h) {
        return false;
    }
}
