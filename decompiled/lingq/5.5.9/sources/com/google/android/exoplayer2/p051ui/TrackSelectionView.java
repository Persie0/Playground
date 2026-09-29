package com.google.android.exoplayer2.p051ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.C2384d0;
import com.google.common.collect.ImmutableList;
import ga.C5735r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ua.C9507p;
import va.C9690d;
import va.InterfaceC9705s;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f13496a;

    /* JADX INFO: renamed from: b */
    public final LayoutInflater f13497b;

    /* JADX INFO: renamed from: c */
    public final CheckedTextView f13498c;

    /* JADX INFO: renamed from: d */
    public final CheckedTextView f13499d;

    /* JADX INFO: renamed from: e */
    public final ViewOnClickListenerC2512a f13500e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f13501f;

    /* JADX INFO: renamed from: g */
    public final HashMap f13502g;

    /* JADX INFO: renamed from: h */
    public boolean f13503h;

    /* JADX INFO: renamed from: i */
    public boolean f13504i;

    /* JADX INFO: renamed from: j */
    public InterfaceC9705s f13505j;

    /* JADX INFO: renamed from: k */
    public CheckedTextView[][] f13506k;

    /* JADX INFO: renamed from: l */
    public boolean f13507l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$a */
    public class ViewOnClickListenerC2512a implements View.OnClickListener {
        public ViewOnClickListenerC2512a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f13498c;
            HashMap map = trackSelectionView.f13502g;
            boolean z10 = true;
            if (view == checkedTextView) {
                trackSelectionView.f13507l = true;
                map.clear();
            } else if (view == trackSelectionView.f13499d) {
                trackSelectionView.f13507l = false;
                map.clear();
            } else {
                trackSelectionView.f13507l = false;
                Object tag = view.getTag();
                tag.getClass();
                C2513b c2513b = (C2513b) tag;
                C5735r c5735r = c2513b.f13509a.f12111b;
                C9507p c9507p = (C9507p) map.get(c5735r);
                int i10 = c2513b.f13510b;
                if (c9507p == null) {
                    if (!trackSelectionView.f13504i && map.size() > 0) {
                        map.clear();
                    }
                    map.put(c5735r, new C9507p(c5735r, ImmutableList.m9064b0(Integer.valueOf(i10))));
                } else {
                    ArrayList arrayList = new ArrayList(c9507p.f48929b);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z11 = trackSelectionView.f13503h && c2513b.f13509a.f12112c;
                    if (!z11) {
                        if (!(trackSelectionView.f13504i && trackSelectionView.f13501f.size() > 1)) {
                            z10 = false;
                        }
                    }
                    if (zIsChecked && z10) {
                        arrayList.remove(Integer.valueOf(i10));
                        if (arrayList.isEmpty()) {
                            map.remove(c5735r);
                        } else {
                            map.put(c5735r, new C9507p(c5735r, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z11) {
                            arrayList.add(Integer.valueOf(i10));
                            map.put(c5735r, new C9507p(c5735r, arrayList));
                        } else {
                            map.put(c5735r, new C9507p(c5735r, ImmutableList.m9064b0(Integer.valueOf(i10))));
                        }
                    }
                }
            }
            trackSelectionView.m7419a();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    public static final class C2513b {

        /* JADX INFO: renamed from: a */
        public final C2384d0.a f13509a;

        /* JADX INFO: renamed from: b */
        public final int f13510b;

        public C2513b(C2384d0.a aVar, int i10) {
            this.f13509a = aVar;
            this.f13510b = i10;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f13496a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f13497b = layoutInflaterFrom;
        ViewOnClickListenerC2512a viewOnClickListenerC2512a = new ViewOnClickListenerC2512a();
        this.f13500e = viewOnClickListenerC2512a;
        this.f13505j = new C9690d(getResources());
        this.f13501f = new ArrayList();
        this.f13502g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f13498c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.linguist.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC2512a);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.linguist.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f13499d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.linguist.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC2512a);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: a */
    public final void m7419a() {
        this.f13498c.setChecked(this.f13507l);
        boolean z10 = this.f13507l;
        HashMap map = this.f13502g;
        this.f13499d.setChecked(!z10 && map.size() == 0);
        for (int i10 = 0; i10 < this.f13506k.length; i10++) {
            C9507p c9507p = (C9507p) map.get(((C2384d0.a) this.f13501f.get(i10)).f12111b);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f13506k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (c9507p != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.f13506k[i10][i11].setChecked(c9507p.f48929b.contains(Integer.valueOf(((C2513b) tag).f13510b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7420b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f13501f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f13499d;
        CheckedTextView checkedTextView2 = this.f13498c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f13506k = new CheckedTextView[arrayList.size()][];
        boolean z10 = this.f13504i && arrayList.size() > 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C2384d0.a aVar = (C2384d0.a) arrayList.get(i10);
            boolean z11 = this.f13503h && aVar.f12112c;
            CheckedTextView[][] checkedTextViewArr = this.f13506k;
            int i11 = aVar.f12110a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            C2513b[] c2513bArr = new C2513b[i11];
            for (int i12 = 0; i12 < aVar.f12110a; i12++) {
                c2513bArr[i12] = new C2513b(aVar, i12);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                LayoutInflater layoutInflater = this.f13497b;
                if (i13 == 0) {
                    addView(layoutInflater.inflate(com.linguist.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z11 || z10) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f13496a);
                InterfaceC9705s interfaceC9705s = this.f13505j;
                C2513b c2513b = c2513bArr[i13];
                checkedTextView3.setText(interfaceC9705s.mo18197a(c2513b.f13509a.f12111b.f34803d[c2513b.f13510b]));
                checkedTextView3.setTag(c2513bArr[i13]);
                if (aVar.f12113d[i13] == 4) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f13500e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f13506k[i10][i13] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        m7419a();
    }

    public boolean getIsDisabled() {
        return this.f13507l;
    }

    public Map<C5735r, C9507p> getOverrides() {
        return this.f13502g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f13503h != z10) {
            this.f13503h = z10;
            m7420b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f13504i != z10) {
            this.f13504i = z10;
            if (!z10) {
                HashMap map = this.f13502g;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f13501f;
                    HashMap map2 = new HashMap();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        C9507p c9507p = (C9507p) map.get(((C2384d0.a) arrayList.get(i10)).f12111b);
                        if (c9507p != null && map2.isEmpty()) {
                            map2.put(c9507p.f48928a, c9507p);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m7420b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f13498c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC9705s interfaceC9705s) {
        interfaceC9705s.getClass();
        this.f13505j = interfaceC9705s;
        m7420b();
    }
}
