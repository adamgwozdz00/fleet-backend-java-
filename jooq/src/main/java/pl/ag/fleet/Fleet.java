/*
 * This file is generated by jOOQ.
 */
package pl.ag.fleet;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import pl.ag.fleet.tables.Insurance;
import pl.ag.fleet.tables.Overview;
import pl.ag.fleet.tables.ReFuel;
import pl.ag.fleet.tables.Vehicle;
import pl.ag.fleet.tables.VehicleState;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fleet extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>fleet</code>
     */
    public static final Fleet FLEET = new Fleet();

    /**
     * The table <code>fleet.insurance</code>.
     */
    public final Insurance INSURANCE = Insurance.INSURANCE;

    /**
     * The table <code>fleet.overview</code>.
     */
    public final Overview OVERVIEW = Overview.OVERVIEW;

    /**
     * The table <code>fleet.re_fuel</code>.
     */
    public final ReFuel RE_FUEL = ReFuel.RE_FUEL;

    /**
     * The table <code>fleet.vehicle</code>.
     */
    public final Vehicle VEHICLE = Vehicle.VEHICLE;

    /**
     * The table <code>fleet.vehicle_state</code>.
     */
    public final VehicleState VEHICLE_STATE = VehicleState.VEHICLE_STATE;

    /**
     * No further instances allowed
     */
    private Fleet() {
        super("fleet", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Insurance.INSURANCE,
            Overview.OVERVIEW,
            ReFuel.RE_FUEL,
            Vehicle.VEHICLE,
            VehicleState.VEHICLE_STATE
        );
    }
}
