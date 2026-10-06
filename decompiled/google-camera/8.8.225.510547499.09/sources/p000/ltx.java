package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltx implements lty {

    /* JADX INFO: renamed from: a */
    private static final mwx f39204a;

    static {
        HashMap map = new HashMap();
        map.put(agr.f331g, "accessibility_focus");
        map.put(agr.f332h, "clear_accessibility_focus");
        map.put(agr.f326b, "clear_focus");
        map.put(agr.f328d, "clear_selection");
        map.put(agr.f329e, "click");
        map.put(agr.f344t, "collapse");
        map.put(agr.f319G, "context_click");
        map.put(agr.f339o, "copy");
        map.put(agr.f341q, "cut");
        map.put(agr.f345u, "dismiss");
        map.put(agr.f343s, "expand");
        map.put(agr.f325a, "focus");
        map.put(agr.f323K, "hide_tooltip");
        map.put(agr.f330f, rmwTRjObXLGH.DfOmfegYz);
        map.put(agr.f321I, "move_window");
        map.put(agr.f333i, "next_at_movement_granularity");
        map.put(agr.f335k, "next_html_element");
        map.put(agr.f316D, "page_down");
        map.put(agr.f317E, "page_left");
        map.put(agr.f318F, "page_right");
        map.put(agr.f315C, "page_up");
        map.put(agr.f340p, "paste");
        map.put(agr.f324L, "press_and_hold");
        map.put(agr.f334j, "previous_at_movement_granularity");
        map.put(agr.f336l, "previous_html_element");
        map.put(agr.f338n, "scroll_backward");
        map.put(agr.f313A, "scroll_down");
        map.put(agr.f337m, "scroll_forward");
        map.put(agr.f350z, "scroll_left");
        map.put(agr.f314B, "scroll_right");
        map.put(agr.f348x, "scroll_to_position");
        map.put(agr.f349y, "scroll_up");
        map.put(agr.f327c, "select");
        map.put(agr.f320H, "set_progress");
        map.put(agr.f342r, "set_selection");
        map.put(agr.f346v, "set_text");
        map.put(agr.f347w, "show_on_screen");
        map.put(agr.f322J, "show_tooltip");
        f39204a = mwx.m17118m(map);
    }

    @Override // p000.lty
    /* JADX INFO: renamed from: a */
    public final void mo15980a(lul lulVar, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        if (accessibilityNodeInfoCreateAccessibilityNodeInfo != null) {
            agt agtVarM622a = agt.m622a(accessibilityNodeInfoCreateAccessibilityNodeInfo);
            lulVar.m16008b("accessibility_clickable", agtVarM622a.m638p());
            lulVar.m16008b("checkable", agtVarM622a.m637o());
            lulVar.m16008b(EArqVBjecl.tourI, agtVarM622a.m641s());
            lulVar.m16008b("password", agtVarM622a.m640r());
            lulVar.m16008b("long_clickable", agtVarM622a.m639q());
            lulVar.m16008b("accessibility_screenReaderFocusable", agtVarM622a.f355a.isScreenReaderFocusable());
            lulVar.m16007a("accessibility_className", agtVarM622a.m625b());
            AccessibilityNodeInfo.CollectionInfo collectionInfo = agtVarM622a.f355a.getCollectionInfo();
            bkn bknVar = collectionInfo != null ? new bkn(collectionInfo, (char[]) null) : null;
            if (bknVar != null) {
                lulVar.m16010d(YmzeHXaMYOLk.ZCwUWq, ((AccessibilityNodeInfo.CollectionInfo) bknVar.f3651a).getRowCount());
                lulVar.m16010d("accessibility_collectionInfo_columnCount", ((AccessibilityNodeInfo.CollectionInfo) bknVar.f3651a).getColumnCount());
                lulVar.m16010d("accessibility_collectionInfo_selectionMode", ((AccessibilityNodeInfo.CollectionInfo) bknVar.f3651a).getSelectionMode());
            }
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = agtVarM622a.f355a.getCollectionItemInfo();
            bkn bknVar2 = collectionItemInfo != null ? new bkn((Object) collectionItemInfo, (byte[]) null) : null;
            if (bknVar2 != null) {
                lulVar.m16010d("accessibility_collectionItemInfo_rowIndex", ((AccessibilityNodeInfo.CollectionItemInfo) bknVar2.f3651a).getRowIndex());
                lulVar.m16010d("accessibility_collectionItemInfo_rowSpan", ((AccessibilityNodeInfo.CollectionItemInfo) bknVar2.f3651a).getRowSpan());
                lulVar.m16010d("accessibility_collectionItemInfo_columnIndex", ((AccessibilityNodeInfo.CollectionItemInfo) bknVar2.f3651a).getColumnIndex());
                lulVar.m16010d("accessibility_collectionItemInfo_columnSpan", ((AccessibilityNodeInfo.CollectionItemInfo) bknVar2.f3651a).getColumnSpan());
            }
            Resources resources = view.getResources();
            List listM626d = agtVarM622a.m626d();
            int i = 0;
            while (i < listM626d.size()) {
                agr agrVar = (agr) listM626d.get(i);
                i++;
                String str = "accessibility_action_" + i;
                int iM619a = agrVar.m619a() & (-16777216);
                String strM15989a = (String) f39204a.get(agrVar);
                boolean z = iM619a != 0;
                if (strM15989a == null && z) {
                    strM15989a = lud.m15989a(resources, agrVar.m619a());
                }
                if (strM15989a == null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = true != z ? "unknown" : "custom";
                    objArr[1] = Integer.valueOf(agrVar.m619a());
                    strM15989a = String.format("%s (%d)", objArr);
                }
                CharSequence charSequenceM620b = agrVar.m620b();
                if (charSequenceM620b != null) {
                    strM15989a = String.format("%s: `%s`", strM15989a, charSequenceM620b);
                }
                lulVar.m16007a(str, strM15989a);
            }
        }
    }
}
